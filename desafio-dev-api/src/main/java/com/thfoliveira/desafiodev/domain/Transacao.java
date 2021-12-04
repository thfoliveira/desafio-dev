package com.thfoliveira.desafiodev.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.thfoliveira.desafiodev.domain.enums.TipoTransacaoEnum;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TipoTransacaoEnum tipo;
	
	private LocalDate data;
	
	private LocalTime hora;
	
	private String cartao;
	
	private BigDecimal valor;
	
	@ManyToOne
	private Loja loja;
	
	@ManyToOne
	private Arquivo arquivo;
	
}