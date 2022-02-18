package com.capgemini.proway.service;

import java.util.*;

public class QuestaoTresService {

    /**
     * Verifica a quantidade de anagramas pode ser a partir de uma palavra
     * @param palavra texto para calular a quantidade de anagramas
     * @return Inteiro que representa a quantidade de anagramas podem ser criados a partir
     * da palavra passada como parâmetro
     */
    public Integer getQuantidadeAnagramas(String palavra) {
        Set<String> anagramas = new HashSet<>();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 1; j < palavra.length(); j++) {
                if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {
                    if (palavra.charAt(i) == palavra.charAt(i + 1)) {
                        String x = palavra.substring(i, i + 1);
                        anagramas.add(x);
                    } else {
                        String y = palavra.substring(i, j);
                        String h = palavra.substring(i, i + 1);
                        anagramas.add(h);
                        anagramas.add(y);
                    }
                }
            }
        }
        return anagramas.size();
    }
}
