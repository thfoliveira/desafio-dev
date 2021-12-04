package com.thfoliveira.desafiodev.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.thfoliveira.desafiodev.domain.enums.TipoTransacaoEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransacaoDTO {

	private Long id;
	
	private TipoTransacaoEnum tipo;
	
	private LocalDate data;
	
	private LocalTime hora;
	
	private String cartao;
	
	private BigDecimal valor;
	
}
