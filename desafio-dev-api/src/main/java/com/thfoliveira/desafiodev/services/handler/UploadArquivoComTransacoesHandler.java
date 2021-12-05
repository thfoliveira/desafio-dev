package com.thfoliveira.desafiodev.services.handler;

import org.springframework.stereotype.Service;

import com.thfoliveira.desafiodev.dto.ResultadoImportacaoDTO;
import com.thfoliveira.desafiodev.services.command.UploadArquivoComTransacoesCommand;

@Service
public class UploadArquivoComTransacoesHandler {

	public ResultadoImportacaoDTO execute(UploadArquivoComTransacoesCommand command) {
		ResultadoImportacaoDTO resultado = new ResultadoImportacaoDTO();
		
		// TODO --- VERIFICAR SE EXISTE ARQUIVO
		
		// TODO --- VERIFICAR SE ESTA NO FORMATO ESPERADO
		
		// TODO --- VERIFICAR SE EXISTEM LINHAS PARA IMPORTAR
		
		// TODO --- VERIFICAR SE OS DADOS ESTÃO NO FORMATO CORRETO
		
		// TODO --- IMPORTAR LINHAS
		
		// TODO --- CONTABILIZAR ERROS E ACERTOS
		
		// TODO --- SALVAR REGISTRO DE ARQUIVO IMPORTADO
		
		// TODO --- REPORTAR QUANTITATIVOS DE IMPORTAÇÃO
		
		// TODO --- REPORTAR LINHAS COM PROBLEMAS
				
		return resultado;		
	}
	
}
