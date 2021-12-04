package com.thfoliveira.desafiodev.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArquivoDTO {

	private Long id;
	
	private LocalDateTime dataUpload;
	
	private String nome;
	
	private String path;
	
	private List<TransacaoDTO> transacoes;
}
