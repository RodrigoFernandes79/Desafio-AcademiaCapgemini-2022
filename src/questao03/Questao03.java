/**
/*@author rodrigo
*/

package questao03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Classe Questao03.
 */
public class Questao03 {

	/**
	 *  O método principal para executar o programa.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma palavra qualquer: ");

		String palavra = entrada.nextLine();

		int quantidadeAnagramas = verificaQuantidadeAnagrama(palavra);

		System.out.println(quantidadeAnagramas);
		entrada.close();

	}

	/**
	 *  Método que Verifica  se duas palavras são anagramas.
	 *
	 * @param s1 String - palavra a ser comparada com s2
	 * @param s2 String - Palavra ser comparada com s1
	 * @return retorne true caso forem anagramas, caso contrário ,retorne false
	 */
	public static boolean verificaAnagrama(String s1, String s2) {
		if (s1.toLowerCase().length() != s2.toLowerCase().length()) {
			return false;
		}

		if (s1.toLowerCase() == null || s2.toLowerCase() == null) {
			return false;
		}

		char[] arrayString1 = s1.toLowerCase().toCharArray();
		char[] arrayString2 = s2.toLowerCase().toCharArray();

		Arrays.sort(arrayString1);
		Arrays.sort(arrayString2);

		if (Arrays.equals(arrayString1, arrayString2)) {

			System.out.println(s1 + s2 + Arrays.toString(arrayString1) + Arrays.toString(arrayString2));

			return true;

		}
		return false;

	}

	/**
	 * Método que indetifica a quantidade de anagramas de uma palavra de si mesma,
	 *
	 * @param String s - palavra a ser analisada
	 * @return a soma de quantidades de possíveis anagramas
	 */
	public static Integer verificaQuantidadeAnagrama(String s) {
		List<String> listaSubstring = verificaPossiveisAnagramas(s);
		int somaQuantidade = 0;
		for (int i = 0; i < listaSubstring.size(); i++) {
			for (int j = i + 1; j < listaSubstring.size(); j++) {
				if (verificaAnagrama(listaSubstring.get(i), listaSubstring.get(j))) {
					somaQuantidade++;
				}
			}
		}
		return somaQuantidade;
	}

	/**
	 * Método que combina possíveis quantidades de anagramas.
	 *
	 * @param String s - palavra a ser analisada
	 * @return uma lista do tipo String com as possiveis combinações de anagramas da palavra inserida
	 */
	private static List<String> verificaPossiveisAnagramas(String s) {
		List<String> combinaCaracteres = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++)
				combinaCaracteres.add(s.substring(i, j));

		}
		return combinaCaracteres;

	}
}
