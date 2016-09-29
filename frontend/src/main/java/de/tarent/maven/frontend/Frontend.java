package de.tarent.maven.frontend;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.tarent.maven.backend.SuperStorage;
import de.tarent.maven.common.MegaClass;

public class Frontend {
    private static final Logger LOGGER = LogManager.getLogger(Frontend.class);

    private final SuperStorage storage;
    private final MegaClass mega;

    public Frontend(final String path) {
        LOGGER.info("Init frontend with path " + path);
        storage = new SuperStorage(path);
        mega = new MegaClass();
    }

    private void work() {
        String line;
        while ((line = storage.getLine()) != null) {
            System.out.println(mega.doTheMagic(line));
        }
    }

    public static void main(final String[] args) {
        if (args.length == 1) {
            final Frontend frontend = new Frontend(args[0]);
            frontend.work();
        } else {
            System.err.println("Please give me the path to the storage!");
        }
    }
}
