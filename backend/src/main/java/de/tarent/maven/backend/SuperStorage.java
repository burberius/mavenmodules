package de.tarent.maven.backend;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SuperStorage {
    private static final Logger LOGGER = LogManager.getLogger(SuperStorage.class);

    private List<String> storage;
    private int pos = 0;

    public SuperStorage(final String string) {
        final Path path = Paths.get(string, "storage.txt");
        try {
            storage = Files.readAllLines(path);
        } catch (final IOException e) {
            LOGGER.error("Couldn't load storage");
            storage = new ArrayList<>();
        }
        LOGGER.info("Loaded " + storage.size() + " lines!");
    }

    public String getLine() {
        String result = null;
        if (pos < storage.size()) {
            result = storage.get(pos);
            pos++;
        }
        return result;
    }

    public int getSize() {
        return storage.size();
    }
}
