package com.thfoliveira.desafiodev.domain.enums;

import lombok.Getter;

public enum TipoTransacaoEnum {
	
	DEBITO					(1, "Débito"),
	BOLETO					(2, "Boleto"),
	FINANCIAMENTO			(3, "Financiamento"),
	CREDITO					(4, "Crédito"),
	RECEBIMENTO_EMPRESTIMO	(5, "Recebimento de Empréstimo"),
	VENDAS					(6, "Vendas"),
	RECEBIMENTO_TED			(7, "Recebimento de TED"),
	RECEBIMENTO_DOC			(8, "Recebimento de DOC"),
	ALUGUEL					(9, "Aluguel");
	
	@Getter
	private int tipo;
	
	@Getter
	private String descricao;
	
	TipoTransacaoEnum(int tipo, String descricao) {
		this.tipo = tipo;
		this.descricao = descricao;
	}

}
