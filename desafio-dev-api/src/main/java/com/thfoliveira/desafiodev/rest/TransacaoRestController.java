package com.thfoliveira.desafiodev.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacaoRestController {
	
	@PostMapping("/upload")
	public ResponseEntity<?> uploadTransacoes() {
		
		// TODO --- IMPLEMENTAR UPLOAD DE CNAB
		
		return ResponseEntity.notFound().build();
	}
	
}
