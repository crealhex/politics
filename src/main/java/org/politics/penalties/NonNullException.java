package org.politics.penalties;

public class NonNullException extends EvaluationException {

    public NonNullException() {
        super("Null prevention assert with the value inserted");
    }

    public NonNullException(String message) {
        super(message);
    }

    public NonNullException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
