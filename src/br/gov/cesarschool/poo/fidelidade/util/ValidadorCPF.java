package br.gov.cesarschool.poo.fidelidade.util;

public class ValidadorCPF {
	public static boolean ehCpfValido(String cpf) {
		boolean isValid = false;
		String cleanCPF = cpf.replace(".", "").replace("-", "");
		int sum = 0;
		
		if(cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}") && cleanCPF.length() == 11){
			for (int i = 0; i < 9; i++) {
		        sum += Character.getNumericValue(cleanCPF.charAt(i)) * (10 - i);
		    }
			int resto = sum % 11;
			int primeiroDigito = resto < 2 ? 0 : 11 - resto;
			sum  = 0;
		    for (int i = 0; i < 10; i++) {
		        sum += Character.getNumericValue(cleanCPF.charAt(i)) * (11 - i);
		    }
		    resto = sum % 11;
		    int segundoDigito = resto < 2 ? 0 : 11 - resto;
		    if(cleanCPF.charAt(9) == Character.forDigit(primeiroDigito, 10) 
		    		&& cleanCPF.charAt(10) == Character.forDigit(segundoDigito, 10)){
		    	isValid = true;
		    }

		} 
		return isValid;
	}
}
