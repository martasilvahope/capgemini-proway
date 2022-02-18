# Prcesso seletivo Capgemini 2022

### Desafio

1) Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

```java
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
```

2) O site considera uma senha forte quando ela satisfaz os seguintes critérios:
* Possui no mínimo 6 caracteres.
* Contém no mínimo 1 digito.
* Contém no mínimo 1 letra em minúsculo.
* Contém no mínimo 1 letra em maiúsculo.
* Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ 

```java
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
```

3) Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

```java
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
```