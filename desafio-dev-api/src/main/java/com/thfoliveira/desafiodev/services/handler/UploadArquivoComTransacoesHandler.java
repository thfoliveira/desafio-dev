package com.thfoliveira.desafiodev.services.handler;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.thfoliveira.desafiodev.dto.ResultadoImportacaoDTO;
import com.thfoliveira.desafiodev.exception.ArquivoVazioException;
import com.thfoliveira.desafiodev.exception.FormatoArquivoInvalidoException;
import com.thfoliveira.desafiodev.services.command.UploadArquivoComTransacoesCommand;

@Service
public class UploadArquivoComTransacoesHandler {

	public ResultadoImportacaoDTO execute(UploadArquivoComTransacoesCommand command) throws ArquivoVazioException, FormatoArquivoInvalidoException {
		if (verificarSeArquivoVazio(command.getArquivo()))
			throw new ArquivoVazioException();  
		
		if (verificarSeFormatoInvalido(command.getArquivo()))
			throw new FormatoArquivoInvalidoException();
				
		ResultadoImportacaoDTO resultado = new ResultadoImportacaoDTO();
		
		// TODO --- VERIFICAR SE EXISTEM LINHAS PARA IMPORTAR
		
		// ------------ FAZER A LEITURA DO .txt E VERIFICAR SE TEM LINHAS PARA IMPORTAR  
		
		// TODO --- LOOP 
		
			// TODO --- VERIFICAR SE OS DADOS ESTÃO NO FORMATO CORRETO
		
			// TODO --- DADOS CORRETOS
		
				// TODO --- IMPORTAR LINHA
		
				// TODO --- CONTABILIZAR COMO LINHA IMPORTADA
		
			// TODO --- DADOS INCORRETOS
		
				// TODO --- CAPTURAR ERRO NA LINHA
		
				// TODO --- CONTABILIZAR COMO LINHA NÃO IMPORTADA
		
		// TODO --- FIM LOOP
		
		// TODO --- SALVAR REGISTRO DE ARQUIVO IMPORTADO
						
		return resultado;		
	}

	private boolean verificarSeFormatoInvalido(MultipartFile arquivo) {
		return !StringUtils.getFilenameExtension(arquivo.getOriginalFilename()).equalsIgnoreCase("txt");
	}

	private boolean verificarSeArquivoVazio(MultipartFile arquivo) {
		return arquivo.isEmpty();
	}
	
}
