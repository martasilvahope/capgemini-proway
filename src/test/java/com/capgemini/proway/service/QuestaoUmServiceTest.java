package com.capgemini.proway.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QuestaoUmServiceTest {

	private QuestaoUmService service;
	
	@BeforeEach
	void init() {
	    service = new QuestaoUmService();
	}
	
	@DisplayName("Deve retornar string contendo seis linhas")
	@Test
	void testConverterParaTextoSuccess() {
		String result = service.converterParaTexto(6);
		String actual =
				"     *\n" +
				"    **\n" +
				"   ***\n" +
				"  ****\n" +
				" *****\n" +
				"******\n";
		assertEquals(result, actual);
	}

	@DisplayName("Deve retornar exeption quando a quantidade de linhas for menor ou igual a zero")
	@Test
	void testConverterParaTextoComErroMenotOuIgualAZero() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() -> service.converterParaTexto(0));
		assertEquals("A quantidade de linhas deve ser maior que zero", exception.getMessage());
	}

}


