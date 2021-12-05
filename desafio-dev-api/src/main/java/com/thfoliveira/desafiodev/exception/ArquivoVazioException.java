package com.thfoliveira.desafiodev.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ArquivoVazioException extends Exception {

	private static final long serialVersionUID = -1441156887651949947L;

	public ArquivoVazioException() {
        super();
    }
	
    public ArquivoVazioException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ArquivoVazioException(String message) {
        super(message);
    }
	
}
