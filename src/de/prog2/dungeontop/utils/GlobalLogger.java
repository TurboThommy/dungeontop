package de.prog2.dungeontop.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GlobalLogger {

    private static final Logger LOGGER = Logger.getGlobal();

    public static void log(String message){
        LOGGER.log(Level.ALL, message);
    }

    public static void warning(String message){
        LOGGER.warning(message);
    }

}
