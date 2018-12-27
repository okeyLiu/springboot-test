package com.okliu.springboot.exception;
/**
 * 
  * �༶�쳣
 * @author liuhaolie
 *
 */
public class ClazzException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ClazzException(String message) {
		super(message);
	}

	public ClazzException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
