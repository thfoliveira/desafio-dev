package com.thfoliveira.desafiodev.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.thfoliveira.desafiodev.domain.Dono;
import com.thfoliveira.desafiodev.dto.DonoDTO;

@Component
public class DonoConverter implements Converter<Dono, DonoDTO> {

	@Override
	public DonoDTO toDto(Dono dono) {
		return new DonoDTO(
					dono.getId(), 
					dono.getNome(), 
					dono.getCpf());
	}

	@Override
	public List<DonoDTO> toList(List<Dono> list) {
		return list.stream().map(dono -> toDto(dono)).collect(Collectors.toList());
	}	
	
}
