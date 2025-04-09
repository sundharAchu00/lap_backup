package edu.jsp.exception.customException;



public class InvalidException extends Exception {
	 private String message;
	 
	public InvalidException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
	
}
