package de.tarent.maven.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MegaClass {
    private static final Logger LOGGER = LogManager.getLogger(MegaClass.class);

    public String doTheMagic(final String input) {
        LOGGER.info("Input: " + input);
        String output = input.replace('a', 'ä');
        output = output.replace('o', 'ö');
        output = output.replace('u', 'ü');
        output = output.replace('O', 'Ö');
        output = output.replace('U', 'Ü');
        output = output.replace('A', 'Ä');
        output = output.replace('s', 'ß');
        LOGGER.info("Output: " + output);
        return output;
    }
}
