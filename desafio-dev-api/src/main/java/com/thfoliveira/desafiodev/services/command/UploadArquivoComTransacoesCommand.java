package com.thfoliveira.desafiodev.services.command;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadArquivoComTransacoesCommand {

	private MultipartFile arquivo;
	
}
