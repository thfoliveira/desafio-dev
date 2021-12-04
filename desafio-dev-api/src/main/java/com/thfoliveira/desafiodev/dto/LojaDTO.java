package com.thfoliveira.desafiodev.dto;

import java.util.List;

import com.thfoliveira.desafiodev.domain.Transacao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LojaDTO {

	private Long id;
	
	private String nome;
	
	private DonoDTO dono;
	
	private List<Transacao> transacoes;
	
}