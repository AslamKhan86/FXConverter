package com.sc.assessment.exception;

public class UserException extends Exception {

	private static final long serialVersionUID = 1L;
	private String errorMsg;
	private int errorCode;

	public UserException(int errorCode, String errorMsg) {
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public int getErrorCode() {
		return errorCode;
	}

}
