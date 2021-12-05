package com.thfoliveira.desafiodev.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErroDTO {

	private String linha;
	
	private String erro;
	
}
