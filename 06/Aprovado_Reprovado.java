/**
 *  MOSTRA A SITUA��O DO ALUNO:
 *  
 *  APROVADO
 *  RECUPERA��O
 *  REPROVADO
 */

package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aprovado_Reprovado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do Aluno: ");
		String nome = sc.nextLine();
		System.out.print("Entre com a 1� nota: ");
		double n1 = sc.nextDouble();
		System.out.print("Entre com a 2� nota: ");
		double n2 = sc.nextDouble();
		System.out.print("Entre com a 3� nota: ");
		double n3 = sc.nextDouble();
		System.out.print("Entre com a 4� nota: ");
		double n4 = sc.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.println(nome + ", sua nota final foi: " + df.format(media) );
		
		if(media >= 7) {
			System.out.println("Parab�ns est� Aprovado.");
		}else if (media < 7 && media >= 5){
			System.out.println("Est� de Recupera��o.");
		}else {
			System.out.println("Infelizmente est� Reprovado.");
		}
		
		sc.close();

	}

}
