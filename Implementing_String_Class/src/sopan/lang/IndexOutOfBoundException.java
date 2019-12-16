package sopan.lang;

import java.lang.RuntimeException;
import java.lang.String;

public class IndexOutOfBoundException extends RuntimeException {

	public IndexOutOfBoundException() {
		super();
	}
	public IndexOutOfBoundException(String s) {
		super(s);
	}
	
}
