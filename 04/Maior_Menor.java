/**
 * ENTRA COM 2 NÚMEROS INTEIROS E MOSTRA
 * O MAIOR E O MENOR DELES.
 */

package exercicios;

import java.util.Scanner;

public class Maior_Menor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 2 números inteiros.");
		System.out.print("Primerio número: ");
		int n1 = sc.nextInt(); 
		System.out.print("Segundo número: ");
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
		
		System.out.println("O número maior foi: " + maior);
		System.out.println("O número menor foi: " + menor);
		
		
		
		sc.close();

	}

}
