package com.training;

public class RangeCheckException extends Exception {
	
	private String message;
	
	public RangeCheckException(String message)
	{
		super();
		this.message=message;
	}

	@Override
	public String getMessage() {

		return super.getMessage();
	}

	
}
