package com.thfoliveira.desafiodev.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultadoImportacaoDTO {

	private Long total;
	
	private Long importados;
	
	private Long naoImportados;
	
	private List<ErroDTO> erros;
	
	public boolean temErros() {
		return this.erros.size() > 0;
	}
	
}
