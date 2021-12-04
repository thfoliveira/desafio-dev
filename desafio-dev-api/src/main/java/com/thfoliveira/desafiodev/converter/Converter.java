package com.thfoliveira.desafiodev.converter;

import java.util.List;

public interface Converter<K, T> {
	
	public T toDto(K obj);
	
	public List<T> toList(List<K> list);

}
