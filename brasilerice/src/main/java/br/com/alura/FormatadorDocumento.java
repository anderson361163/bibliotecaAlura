package br.com.alura;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;
import br.com.caelum.stella.validation.Validator;

public class FormatadorDocumento {
	
	public static void main(String[] args) {
		 String cpf = "862.883.667-57";
		 String cnpj = "98.610.832/0001-24";
		 String tituloEleitor = "417453530116";
		 
		 //--------------------------------------- 
		 
		 String cpfSemFormatacao = RetiraFormatacao(new CPFFormatter(), cpf);
		 String cpfFormatado = formatarDocumento(new CPFFormatter(), cpf);
		 
		 System.out.println(cpfSemFormatacao);
		 System.out.println(cpfFormatado);
		 
		 //--------------------------------------- 

		 String cnpjSemFormatacao = RetiraFormatacao(new CNPJFormatter(), cnpj);
		 String cnpjFormatado = formatarDocumento(new CNPJFormatter(), cnpj);
		 
		 System.out.println(cnpjSemFormatacao);
		 System.out.println(cnpjFormatado);
		 
		 //--------------------------------------- 

		 String tituloformatado = formatarDocumento(new TituloEleitoralFormatter(), tituloEleitor);
		 String titulosemFormatacao = RetiraFormatacao(new TituloEleitoralFormatter(), tituloEleitor);
		 
		 
	     System.out.println(tituloformatado);
	     System.out.println(titulosemFormatacao);
		
	}
	
	public static String formatarDocumento(Formatter formatador, String documento){
	    return formatador.format(documento);
	}
	
	public static String RetiraFormatacao(Formatter formatador, String documento){
	    return formatador.unformat(documento);
	}
	
	
}
