/**************************************
 * ENTRA COM QUATRO NOTAS BIMESTRAIS 
 * E MOSTRA A MÉDIA DELAS.
 */

package exercicios;

import java.util.Scanner;

public class Media_Nota {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do Aluno: ");
		String nome = sc.nextLine();
		System.out.print("Entre com a 1ª nota: ");
		double n1 = sc.nextDouble();
		System.out.print("Entre com a 2ª nota: ");
		double n2 = sc.nextDouble();
		System.out.print("Entre com a 3ª nota: ");
		double n3 = sc.nextDouble();
		System.out.print("Entre com a 4ª nota: ");
		double n4 = sc.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		
		System.out.printf("A média de " + nome + " foi: %.1f%n" ,  media);
		sc.close();

	}

}
