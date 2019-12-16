package sopan.lang;

import java.lang.String;

public class StringOutOfBoundException extends IndexOutOfBoundException{
	
	public StringOutOfBoundException() {
		super();
	}
	
	public StringOutOfBoundException(String s) {
		super(s);
	}
	public StringOutOfBoundException(int index) {
		super("String Out Of Bound Exception : "+index);		
	}
	
}
