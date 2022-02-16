package com.capgemini.proway.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestaoDoisService {

	public Boolean validarSenha(String senha) {
		Pattern pattern = Pattern.compile("^.*(?=.{6})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).*$");
		Matcher matcher = pattern.matcher(senha);
        return matcher.matches();
	}
	
}
