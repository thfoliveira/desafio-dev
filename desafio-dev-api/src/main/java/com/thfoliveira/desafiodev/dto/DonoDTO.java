package com.thfoliveira.desafiodev.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonoDTO {

	private Long id;
	
	private String nome;
	
	private String cpf;
	
}
