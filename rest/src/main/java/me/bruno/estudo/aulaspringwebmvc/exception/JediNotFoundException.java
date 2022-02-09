package me.bruno.estudo.aulaspringwebmvc.exception;

public class JediNotFoundException extends RuntimeException {

    public JediNotFoundException() {
    }

    public JediNotFoundException(String message) {
        super(message);
    }

    public JediNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public JediNotFoundException(Throwable cause) {
        super(cause);
    }

    public JediNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
