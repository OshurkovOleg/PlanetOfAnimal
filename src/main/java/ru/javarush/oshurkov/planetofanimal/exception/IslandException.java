package ru.javarush.oshurkov.planetofanimal.exception;

public class IslandException extends RuntimeException{
    public IslandException() {
    }

    public IslandException(String message) {
        super(message);
    }

    public IslandException(String message, Throwable cause) {
        super(message, cause);
    }

    public IslandException(Throwable cause) {
        super(cause);
    }

    public IslandException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
