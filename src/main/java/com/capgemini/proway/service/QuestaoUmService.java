package com.capgemini.proway.service;

public class QuestaoUmService {

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
