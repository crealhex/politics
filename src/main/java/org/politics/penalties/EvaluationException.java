package org.politics.penalties;

public class EvaluationException extends Exception {

    protected Throwable throwable;

    public EvaluationException(String message) {
        super(message);
    }

    public EvaluationException(String message, Throwable throwable) {
        super(message);
        this.throwable = throwable;
    }

    @Override
    public synchronized Throwable getCause() {
        return throwable;
    }
}
