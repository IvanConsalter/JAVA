/*******************************************
 * ENTRA COM DOIS N�MEROS E MOSTRA A SUA:
 * 
 * SOMA
 * SUBTRA��O
 * DIVIS�O
 * MULTIPLI��O
 * 
 * 
 */

package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SSMD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com dois n�meros.");
		System.out.print("Primeiro n�mero: ");
		double n1 = sc.nextDouble();
		System.out.print("Segundo n�mero: ");
		double n2 = sc.nextDouble();
		
		double soma = n1 + n2;
		double sub = n1 - n2;
		double mult = n1 * n2;
		double div = n1 / n2;
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.println();
		System.out.println(n1 + " + " + n2 + " = " + df.format(soma));
		System.out.println(n1 + " - " + n2 + " = " + df.format(sub));
		System.out.println(n1 + " * " + n2 + " = " + df.format(mult));
		System.out.printf(n1 + " / " + n2 + " = " + df.format(div));
		
		
		sc.close();
	}

}
