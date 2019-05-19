/**
 * MOSTRA SE O NÚMERO É PAR OU ÍMPAR
 */
package exercicios;

import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Esse número é PAR.");
		}else {
			System.out.println("Esse número é IMPAR.");
		}
		
		sc.close();

	}

}
