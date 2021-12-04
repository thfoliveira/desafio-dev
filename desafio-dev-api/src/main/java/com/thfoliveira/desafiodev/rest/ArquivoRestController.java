package com.thfoliveira.desafiodev.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thfoliveira.desafiodev.converter.ArquivoConverter;
import com.thfoliveira.desafiodev.domain.Arquivo;
import com.thfoliveira.desafiodev.dto.ArquivoDTO;
import com.thfoliveira.desafiodev.repository.ArquivoRepository;

@RestController
@RequestMapping("/arquivos")
public class ArquivoRestController {

	private @Autowired ArquivoRepository arquivoRepository;
	
	@GetMapping
	public ResponseEntity<List<ArquivoDTO>> listarArquivos() {		
		return ResponseEntity.ok(new ArquivoConverter().toList(arquivoRepository.findAll()));		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ArquivoDTO> buscarArquivo(@PathVariable Long id) {
		Optional<Arquivo> optional = arquivoRepository.findById(id);
		
		if (optional.isEmpty())
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(new ArquivoConverter().toDto(optional.get()));		
	}
	
}
