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


    @DisplayName("Deve retornar 3 quando informada a palavra ovo")
    @Test
    void getQuantidadeAnagramas() {
        Integer qtd = service.getQuantidadeAnagramas("ovo");
        assertEquals(2, qtd);
    }

    @DisplayName("Deve retornar 2 quando informada a palavra ovo")
    @Test
    void getQuantidadeAnagramasOvo() {
        Integer qtd = service.getQuantidadeAnagramas("ovo");
        assertEquals(2, qtd);
    }
}