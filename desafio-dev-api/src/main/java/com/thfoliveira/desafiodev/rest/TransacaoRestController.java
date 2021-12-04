package com.thfoliveira.desafiodev.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacaoRestController {

	@GetMapping
	public ResponseEntity<?> listarTransacoes() {
		
		// TODO
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/upload")
	public ResponseEntity<?> uploadTransacoes() {
		
		// TODO
		
		return ResponseEntity.notFound().build();
	}
	
}
