package com.thfoliveira.desafiodev.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.thfoliveira.desafiodev.dto.ResultadoImportacaoDTO;
import com.thfoliveira.desafiodev.services.command.UploadArquivoComTransacoesCommand;
import com.thfoliveira.desafiodev.services.handler.UploadArquivoComTransacoesHandler;

@RestController
@RequestMapping("/transacoes")
public class TransacaoRestController {
	
	private @Autowired UploadArquivoComTransacoesHandler handler;
	
	@PostMapping("/upload")
	public ResponseEntity<ResultadoImportacaoDTO> uploadTransacoes(MultipartFile cnab) {		
		ResultadoImportacaoDTO resultado = handler.execute(new UploadArquivoComTransacoesCommand(cnab));
		
		if (resultado.temErros())
			return ResponseEntity.badRequest().body(resultado);
		
		return ResponseEntity.ok(resultado);
	}
	
}
