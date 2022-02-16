package com.capgemini.proway.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoDoisServiceTest {

    private QuestaoDoisService service;

    @BeforeEach
    void setUp() {
        service = new QuestaoDoisService();
    }

    @DisplayName("Deve retornar true caso a senha esteja valida")
    @Test
    void validarSenhaSucesso() {
        Boolean senhaValida = service.validarSenha("Maria@48");
        assertTrue(senhaValida);
    }

    @DisplayName("Deve retornar false caso a senha tenha menos de 6 caracteres")
    @Test
    void validarSenhaErroMenosDeSeisCaracteres() {
        Boolean senhaValida = service.validarSenha("Abc12");
        assertFalse(senhaValida);
    }

    @DisplayName("Deve retornar false caso a senha nao tenha no mínimo um caracter especial !@#$%^&*()-+")
    @Test
    void validarSenhaErroSemCaracterEspecial() {
        Boolean senhaValida = service.validarSenha("Abc12");
        assertFalse(senhaValida);
    }

    @DisplayName("Deve retornar false caso a senha nao tenha no mínimo uma letra maiuscula")
    @Test
    void validarSenhaErroSemLetraMaiuscula() {
        Boolean senhaValida = service.validarSenha("maria@48");
        assertFalse(senhaValida);
    }

    @DisplayName("Deve retornar false caso a senha nao tenha no mínimo uma letra minuscula")
    @Test
    void validarSenhaErroSemLetraMinuscula() {
        Boolean senhaValida = service.validarSenha("MARIA@48");
        assertFalse(senhaValida);
    }

    @DisplayName("Deve retornar false caso a senha nao tenha no mínimo uma digito")
    @Test
    void validarSenhaErroSemDigito() {
        Boolean senhaValida = service.validarSenha("Maria@");
        assertFalse(senhaValida);
    }

}