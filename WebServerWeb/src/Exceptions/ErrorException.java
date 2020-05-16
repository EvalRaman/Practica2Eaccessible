package Exceptions;

public class ErrorException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = -466366471595696474L;

    public ErrorException(String errorMessage) {
        super(errorMessage);
    }
}
