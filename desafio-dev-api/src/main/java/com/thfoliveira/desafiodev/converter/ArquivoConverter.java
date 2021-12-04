package com.thfoliveira.desafiodev.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.thfoliveira.desafiodev.domain.Arquivo;
import com.thfoliveira.desafiodev.dto.ArquivoDTO;

@Component
public class ArquivoConverter implements Converter<Arquivo, ArquivoDTO> {

	@Override
	public ArquivoDTO toDto(Arquivo arquivo) {
		return new ArquivoDTO(
					arquivo.getId(), 
					arquivo.getDataUpload(), 
					arquivo.getNome(), 
					arquivo.getPath(), 
					new TransacaoConverter().toList(arquivo.getTransacoes()));
	}

	@Override
	public List<ArquivoDTO> toList(List<Arquivo> list) {
		return list.stream().map(arquivo -> toDto(arquivo)).collect(Collectors.toList());
	}

}
