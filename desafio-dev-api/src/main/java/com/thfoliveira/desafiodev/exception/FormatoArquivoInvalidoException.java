package com.thfoliveira.desafiodev.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class FormatoArquivoInvalidoException extends Exception {

	private static final long serialVersionUID = 2557973068280320963L;
	
	public FormatoArquivoInvalidoException() {
        super();
    }
	
    public FormatoArquivoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public FormatoArquivoInvalidoException(String message) {
        super(message);
    }

}
