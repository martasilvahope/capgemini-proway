package com.capgemini.proway.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoTresServiceTest {

    QuestaoTresService service;

    @BeforeEach
    void setUp() {
        service = new QuestaoTresService();
    }


    @DisplayName("Deve retornar 3 quando informada a palavra ifailuhkqq")
    @Test
    void getQuantidadeAnagramasIfailuhkqq() {
        Integer qtd = service.getQuantidadeAnagramas("ifailuhkqq");
        assertEquals(3, qtd);
    }

    @DisplayName("Deve retornar 2 quando informada a palavra ovo")
    @Test
    void getQuantidadeAnagramasOvo() {
        Integer qtd = service.getQuantidadeAnagramas("ovo");
        assertEquals(2, qtd);
    }

    @DisplayName("Deve retornar o quando informada apenas uma letra")
    @Test
    void getQuantidadeAnagramasApenasUmaLetra() {
        Integer qtd = service.getQuantidadeAnagramas("a");
        assertEquals(0, qtd);
    }

}