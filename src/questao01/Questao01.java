/*Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os. A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o deve conter nenhum espa�o.
Exemplo:
Entrada:
n = 6


Sa�da:
          *
         **
        ***
       ****
      *****
     ******
*/
/*@author rodrigo
*/

package questao01;

import java.util.Scanner;

/**
 * Classe Questao01.
 */
public class Questao01 {

	/**
	 * O m�todo principal para executar o programa.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a quantidade de vezes: ");

		int qtdDegraus = entrada.nextInt();
		String[] degraus = new String[qtdDegraus];

		for (int i = 1; i <= qtdDegraus; i++) {
			String somaDegrau = " ";
			for (int j = qtdDegraus; j >= 1; j--) {

				if (i >= j) {
					somaDegrau += "*";

				} else {
					somaDegrau += " ";

				}

			}
			degraus[i - 1] = somaDegrau;

		}
		System.out.println(String.join("\n", degraus));

	}
}
