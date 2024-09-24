public class ElementNotFoundExceprion extends RuntimeException {
    public ElementNotFoundExceprion() {
    }

    public ElementNotFoundExceprion(String message) {
        super(message);
    }

    public ElementNotFoundExceprion(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotFoundExceprion(Throwable cause) {
        super(cause);
    }

    public ElementNotFoundExceprion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
