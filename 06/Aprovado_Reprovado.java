/**
 *  MOSTRA A SITUAÇÃO DO ALUNO:
 *  
 *  APROVADO
 *  RECUPERAÇÃO
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
		System.out.print("Entre com a 1ª nota: ");
		double n1 = sc.nextDouble();
		System.out.print("Entre com a 2ª nota: ");
		double n2 = sc.nextDouble();
		System.out.print("Entre com a 3ª nota: ");
		double n3 = sc.nextDouble();
		System.out.print("Entre com a 4ª nota: ");
		double n4 = sc.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.println(nome + ", sua nota final foi: " + df.format(media) );
		
		if(media >= 7) {
			System.out.println("Parabéns está Aprovado.");
		}else if (media < 7 && media >= 5){
			System.out.println("Está de Recuperação.");
		}else {
			System.out.println("Infelizmente está Reprovado.");
		}
		
		sc.close();

	}

}
