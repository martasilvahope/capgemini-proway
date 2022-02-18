package com.capgemini.proway.service;

public class QuestaoUmService {

	/**
	 * Recebe um numero inteiro que representa quantas linhas serão criadas, e quantos
	 * astericos terão em cada linha
	 * @param linhas - numero de linhas a serem criadas
	 * @return <strong>String</strong> contendo a quantidade de linhas passadas como
	 * parâmetro e em cada linha uma quantidade crescente de asteriscos
	 */
	public String converterParaTexto(int linhas) {
		if (linhas > 0) {
			StringBuilder texto = new StringBuilder();
			for (int i = 1; i <= linhas; i++) {
				int branco = linhas - i;
				texto.append(" ".repeat(branco));
				texto.append("*".repeat(i));
				texto.append("\n");
			}
			return texto.toString();
		} else {
			throw new IllegalArgumentException("A quantidade de linhas deve ser maior que zero");
		}
	}

}
