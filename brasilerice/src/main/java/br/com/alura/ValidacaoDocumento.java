package br.com.alura;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {
	
	public static void main(String[] args) {
		String cpf = "862.883.667-57";
		try {
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF valido!!!");
		}catch(InvalidStateException e) {
			System.out.println("CPF inv�lido!!! - " + e);
		}
		
		String cnpj = "82588641000173";
		
	    try{
	    	validarDocumentos(new CNPJValidator(), cnpj);
	    	System.out.println("CNPJ v�lido");
	    }catch (InvalidStateException e) {
	    	System.out.println("CNPJ inv�lido: " + e);
	    }

		/* validadorCNPJ.assertValid(cnpj); */
	    String tituloEleitor="417453530110";
	    try{
	    	validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
	        System.out.println("T�TULO V�LIDO");

	    }catch (InvalidStateException e) {
	      System.out.println("T�TULO INV�LIDO :" + e);
	    }
	}
	
	private static void validarDocumentos (Validator<String> validador, String documento){
		  validador.assertValid(documento);
	}
}
