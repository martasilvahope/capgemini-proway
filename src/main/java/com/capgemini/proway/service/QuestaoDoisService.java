package com.capgemini.proway.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestaoDoisService {

	/**
	 *
	 * @param senha senha a ser validada
	 * @return retorna <strong>true</strong> se a senha respeitar as seguintes regras:
	 * <ul>
	 *   <li>Possui no mínimo 6 caracteres.</li>
	 *   <li>Contém no mínimo 1 digito.</li>
	 *   <li>Contém no mínimo 1 letra em minúsculo.</li>
	 *   <li>Contém no mínimo 1 letra em maiúsculo.</li>
	 *   <li>Contém no mínimo 1 caractere especial. Os caracteres especiais são: <strong>!@#$%^&*()-+</strong></li>
	 * </ul>
	 * caso alguma destas regras não seja satisfeira, retorna <strong>false</strong>
	 */
	public Boolean validarSenha(String senha) {
		Pattern pattern = Pattern.compile("^.*(?=.{6})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).*$");
		Matcher matcher = pattern.matcher(senha);
        return matcher.matches();
	}
	
}
