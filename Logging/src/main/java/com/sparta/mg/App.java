package com.sparta.mg;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.logging.*;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomFormatter());
        logger.addHandler(consoleHandler);

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/log-file.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //TODO: fix this line
        //logger.log(Level.INFO, "this is an info message");
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.fine("This is a fine message");
    }
}
