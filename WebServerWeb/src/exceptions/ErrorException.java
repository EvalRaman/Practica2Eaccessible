package exceptions;

public class ErrorException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErrorException(String errorMessage) {
        super(errorMessage);
    }
}
