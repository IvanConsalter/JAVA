/**
 * MOSTRA SE O N�MERO � PAR OU �MPAR
 */
package exercicios;

import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Esse n�mero � PAR.");
		}else {
			System.out.println("Esse n�mero � IMPAR.");
		}
		
		sc.close();

	}

}
