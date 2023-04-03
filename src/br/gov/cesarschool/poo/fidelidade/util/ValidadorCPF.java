package br.gov.cesarschool.poo.fidelidade.util;

public class ValidadorCPF {
	public static boolean ehCpfValido(String cpf) {
		boolean isValid = false;
		int sum = 0;
		for (int i = 0; i < 9; i++) {
	        sum += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
	    }
		int resto = sum % 11;
		int primeiroDigito = resto < 2 ? 0 : 11 - resto;
		sum  = 0;
	    for (int i = 0; i < 10; i++) {
	        sum += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
	    }
	    resto = sum % 11;
	    int segundoDigito = resto < 2 ? 0 : 11 - resto;
	    if(cpf.charAt(9) == Character.forDigit(primeiroDigito, 10) && cpf.charAt(10) == Character.forDigit(segundoDigito, 10)){
	    	isValid = true;
	    }

		return isValid;
	}
}
