package Day2_Java.exception;

public class AgeInvalidException extends Exception{
	private static final long serialVersionUID = 1492476939602980959L;
	public AgeInvalidException(String message) {
		super(message);
	}
}
