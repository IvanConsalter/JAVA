/**
 * �SUARIO ESCOLHE ENTRE:
 * 
 * ADI��O
 * SUBTRA��O
 * MULTIPLCA��O
 * DIVIS�O
 * 
 */
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MiniCalc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.println("*******************************");
		System.out.println("*                             *");
		System.out.println("*  COD         OPERA��O       *");
		System.out.println("*                             *");
		System.out.println("*  1           ADI��O         *");
		System.out.println("*  2           SUBTRA��O      *");
		System.out.println("*  3           MULTPLICA�AO   *");
		System.out.println("*  4           DIVIS�O        *");
		System.out.println("*                             *");
		System.out.println("*******************************");
		System.out.println("Opera��o entre 2 n�meros.");
		System.out.print("Primeiro n�mero: ");
		double n1 = sc.nextDouble();
		System.out.print("Segundo n�mero: ");
		double n2 = sc.nextDouble();
		
		System.out.print("Entre com o COD da oper��o: ");
		int cod = sc.nextInt();
		
		switch(cod) {
			case 1:
				double soma = n1 + n2;
				System.out.println(n1 + " + " + n2 + " = " + df.format(soma));
				break;
			case 2:
				double sub = n1 - n2;
				System.out.println(n1 + " - " + n2 + " = " + df.format(sub));
				break;
			case 3:
				double mult = n1 * n2;
				System.out.println(n1 + " * " + n2 + " = " + df.format(mult));
				break;
			case 4:
				double div = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + df.format(div));
				break;
			default:
				System.out.println("C�DIGO INV�LIDO");
		}
		
		
		sc.close();

	}

}
