package com.thfoliveira.desafiodev.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arquivos")
public class ArquivoRestController {

	@GetMapping
	public ResponseEntity<?> listarArquivos() {
		
		// TODO
		
		return ResponseEntity.notFound().build();
	}
	
}
