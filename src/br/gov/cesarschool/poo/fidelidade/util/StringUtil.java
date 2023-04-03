package br.gov.cesarschool.poo.fidelidade.util;

public class StringUtil {
	public static boolean ehNuloOuBranco(String str) {
		str = str.strip();
		return (str == null || str == "");
	}
}
