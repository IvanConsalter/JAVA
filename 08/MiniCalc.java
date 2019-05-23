/**
 * ÚSUARIO ESCOLHE ENTRE:
 * 
 * ADIÇÃO
 * SUBTRAÇÃO
 * MULTIPLCAÇÃO
 * DIVISÃO
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
		System.out.println("*  COD         OPERAÇÃO       *");
		System.out.println("*                             *");
		System.out.println("*  1           ADIÇÃO         *");
		System.out.println("*  2           SUBTRAÇÃO      *");
		System.out.println("*  3           MULTPLICAÇAO   *");
		System.out.println("*  4           DIVISÃO        *");
		System.out.println("*                             *");
		System.out.println("*******************************");
		System.out.println("Operação entre 2 números.");
		System.out.print("Primeiro número: ");
		double n1 = sc.nextDouble();
		System.out.print("Segundo número: ");
		double n2 = sc.nextDouble();
		
		System.out.print("Entre com o COD da operção: ");
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
				System.out.println("CÓDIGO INVÁLIDO");
		}
		
		
		sc.close();

	}

}
