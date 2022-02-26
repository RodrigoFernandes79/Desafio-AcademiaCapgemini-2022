/**
/*@author rodrigo
*/
package questao02;

import java.util.Scanner;
import java.util.regex.Pattern;


/**
 * Classe Questao02.
 */
public class Questao02 {

	/**
	 * O m�todo principal para executar o programa.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String senha;
		do {
			System.out.print("\nDigite sua senha: ");

			senha = entrada.nextLine();
			String valor = validaSenha(senha);
			System.out.print(valor);

		}

		while (loopSenha(senha) == false);

	}

	/**
	 * M�todo est�tico Valida senha.
	 *
	 * @param insere uma string da senha do usu�rio.
	 * @return uma string com mensagens de valida��o ou n�o.
	 */
	public static String validaSenha(String senha) {
		int x = 0;
		int y;
		boolean senhaDigito = Pattern.matches("^(?=.*\\d).+$", senha),
				senhaMinuscula = Pattern.matches("^(?=.*[a-z]).+$", senha),
				senhaMaiuscula = Pattern.matches("^(?=.*[A-Z]).+$", senha),
				senhaEspecial = Pattern.matches("^(?=.*[-+_!@#$%^&*.,?]).+$", senha);
		if (senha.length() < 6) {

			System.out.println("A sua senha possui " + senha.length() + " caracteres");
			System.out.println("Para ser segura, a sua senha deve possuir no m�nimo 6 caracteres");
		}
		if (senhaDigito == false) {
			x += 1;
			System.out.println("A sua senha deve possuir pelo menos 1 digito");
		}
		if (senhaMinuscula == false) {
			x += 1;
			System.out.println("A sua senha deve possuir pelo menos uma letra Min�scula");
		}
		if (senhaMaiuscula == false) {
			x += 1;
			System.out.println("A sua senha deve possuir pelo menos uma letra Mai�scula");
		}
		if (senhaEspecial == false) {
			x += 1;
			System.out.println("A sua senha deve possuir pelo menos uma Caractere Especial");
		}
		if (senha.length() + x >= 6 && senhaEspecial == true && senhaMaiuscula == true && senhaMinuscula == true
				&& senhaDigito == true) {

			return "Senha Adicionada com Sucesso";
		}
		if (senha.length() + x >= 6 || senhaEspecial == false && senhaMaiuscula == false&& senhaMinuscula == false
				&& senhaDigito == false) {
			return "Tente novamente...";
		} else {
			y = (6 - senha.length());
			return "Senha fraca acresente mais " + y + " caracteres";
		}

	}

	/**
	 *  M�todo est�tico Loop senha.
	 *
	 * @param recebe como par�metro a senha que o usu�rio inseriu.
	 * @return retorna verdadeiro se todos os requisitos forem preenchidos , senao retorna falso
	 */
	public static boolean loopSenha(String senha) {
		boolean senhaDigito = Pattern.matches("^(?=.*\\d).+$", senha),
				senhaMinuscula = Pattern.matches("^(?=.*[a-z]).+$", senha),
				senhaMaiuscula = Pattern.matches("^(?=.*[A-Z]).+$", senha),
				senhaEspecial = Pattern.matches("^(?=.*[-+_!@#$%^&*.,?]).+$", senha);
		if (senha.length() >= 6 && senhaDigito == true && senhaMinuscula == true && senhaMaiuscula == true
				&& senhaEspecial == true) {
			return true;
		}
		return false;

	}

}
