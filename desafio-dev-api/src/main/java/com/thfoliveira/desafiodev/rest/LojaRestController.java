package com.thfoliveira.desafiodev.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thfoliveira.desafiodev.converter.LojaConverter;
import com.thfoliveira.desafiodev.domain.Loja;
import com.thfoliveira.desafiodev.dto.LojaDTO;
import com.thfoliveira.desafiodev.repository.LojaRepository;

@RestController
@RequestMapping("/lojas")
public class LojaRestController {
	
	private @Autowired LojaRepository lojaRepository;
	
	@GetMapping
	public ResponseEntity<List<LojaDTO>> listarLojas() {
		return ResponseEntity.ok(new LojaConverter().toList(lojaRepository.findAll()));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LojaDTO> buscarLoja(@PathVariable Long id) {
		Optional<Loja> optional = lojaRepository.findById(id);
		
		if (optional.isEmpty())
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(new LojaConverter().toDto(optional.get()));
	}

}
