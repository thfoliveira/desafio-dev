
package com.thfoliveira.desafiodev.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.thfoliveira.desafiodev.domain.Loja;
import com.thfoliveira.desafiodev.dto.LojaDTO;

@Component
public class LojaConverter implements Converter<Loja, LojaDTO> {

	@Override
	public LojaDTO toDto(Loja loja) {
		return new LojaDTO(
						loja.getId(), 
						loja.getNome(), 
						new DonoConverter().toDto(loja.getDono()), 
						new TransacaoConverter().toList(loja.getTransacoes()));
	}

	@Override
	public List<LojaDTO> toList(List<Loja> list) {
		return list.stream().map(loja -> toDto(loja)).collect(Collectors.toList());
	}

}
