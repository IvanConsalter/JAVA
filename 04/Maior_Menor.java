/**
 * ENTRA COM 2 N�MEROS INTEIROS E MOSTRA
 * O MAIOR E O MENOR DELES.
 */

package exercicios;

import java.util.Scanner;

public class Maior_Menor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 2 n�meros inteiros.");
		System.out.print("Primerio n�mero: ");
		int n1 = sc.nextInt(); 
		System.out.print("Segundo n�mero: ");
		int n2 = sc.nextInt();
		
		int maior = 0;
		int menor = 0;
		
		if(n1 > n2) {
			maior = n1;
			menor = n2;
		}else if(n2 > n1) {
			maior = n2;
			menor = n1;
		}
		
		System.out.println("O n�mero maior foi: " + maior);
		System.out.println("O n�mero menor foi: " + menor);
		
		
		
		sc.close();

	}

}
