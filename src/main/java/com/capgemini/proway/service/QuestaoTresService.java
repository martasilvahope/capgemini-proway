package com.capgemini.proway.service;

import java.util.*;

public class QuestaoTresService {

    public Integer getQuantidadeAnagramas(String palavra) {
        Set<String> anagramas = new HashSet<>();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 1; j < palavra.length(); j++) {
                if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {
                    if (palavra.charAt(i) == palavra.charAt(i + 1)) {
                        String x = palavra.substring(i, i + 1);
                        anagramas.add(ordenarPalavra(x));
                    } else {
                        String y = palavra.substring(i, j);
                        String h = palavra.substring(i, i + 1);
                        anagramas.add(ordenarPalavra(h));
                        anagramas.add(ordenarPalavra(y));
                    }
                }
            }
        }
        return anagramas.size();
    }

    private String ordenarPalavra(String palavra) {
        char[] letras = palavra.toCharArray();
        Arrays.sort(letras);
        return new String(letras);
    }

}
