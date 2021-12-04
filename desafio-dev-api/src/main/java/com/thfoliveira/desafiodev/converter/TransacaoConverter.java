package com.thfoliveira.desafiodev.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.thfoliveira.desafiodev.domain.Transacao;
import com.thfoliveira.desafiodev.dto.TransacaoDTO;

@Component
public class TransacaoConverter implements Converter<Transacao, TransacaoDTO> {

	@Override
	public TransacaoDTO toDto(Transacao transacao) {
		return new TransacaoDTO(
						transacao.getId(), 
						transacao.getTipo(), 
						transacao.getData(), 
						transacao.getHora(), 
						transacao.getCartao(), 
						transacao.getValor());
	}

	@Override
	public List<TransacaoDTO> toList(List<Transacao> list) {
		return list.stream().map(transacao -> toDto(transacao)).collect(Collectors.toList());
	}

}
