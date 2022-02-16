package com.capgemini.proway.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class QuestaoTresService {

	public Boolean calcularAnagramas(String palavra) {
		Set<String> anagramas = new HashSet<>();
		for (int i = 0; i < palavra.length(); i++) {
			String trecho = palavra.substring(0, i + 1);
			trecho = ordenarTrecho(trecho);
			for (int j = 0; j < palavra.length(); j++) {
				String anagrama = ordenarTrecho(palavra.substring(j + 1, ultimoIndice(palavra, j + i + 2)));
				for (int k = 0; k < palavra.length(); k++) {

				}

				if (anagrama.equals(trecho)) {
					anagramas.add(anagrama);
					break;
				}
			}
		}
		System.out.println(anagramas);
		return null;
	}

	private int ultimoIndice(String palavra, int i) {
		return i < palavra.length() ? i : palavra.length();
	}

	public String ordenarTrecho(String trecho) {
		char[] caracteres = trecho.toCharArray();
		Arrays.sort(caracteres);
		return new String(caracteres);
	}

	public static void main(String[] args) {
		new QuestaoTresService().calcularAnagramas("ifailuhkqq");
	}

}
