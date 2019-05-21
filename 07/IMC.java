/**************************************
 * ENTRA COM ALTURA E PESO DE UMA PESSOA
 * E MOSTRA O SEU IMC(INDICE DE MASSA CORPORAL)
 */
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------");
		System.out.println("-                TABELA DE IMC                   -");
		System.out.println("-                                                -");
		System.out.println("-  IMC                       RESULTADO           -");
		System.out.println("-                                                -");
		System.out.println("-  MENOS QUE 18,5            ABAIXO DO PESO      -");
		System.out.println("-  ENTRE 18,5 E 24,9         PESO NORMAL         -");
		System.out.println("-  ENTRE 25 E 29,9           SOBREPESO           -");
		System.out.println("-  ENTRE 30 E 34,9           OBESIDADE GRAU 1    -");
		System.out.println("-  ENTRE 35 E 39,9           OBESIDADE GRAU 2    -");
		System.out.println("-  ACIMA DE 40               OBESIDADE GRAU 3    -");
		System.out.println("-                                                -");
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("Informe seu Nome, Peso, Altura.");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Peso(Kg): ");
		double peso = sc.nextDouble();
		System.out.print("Altura(cm): ");
		double alt =sc.nextDouble();
		
		double imc = peso/((alt/100)*(alt/100));
		
		DecimalFormat df = new DecimalFormat("###,###.#");
		
		if(imc < 18.5) {
			System.out.println(nome + ", o seu IMC é de: " + df.format(imc) + "(ABAIXO DO PESO)");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println(nome + ", o seu IMC é de: " + df.format(imc) + "(PESO NORMAL)");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println(nome + ", o seu IMC é de: " + df.format(imc) + "(SOBREPESO)");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println(nome + ", o seu IMC é de: " + df.format(imc) + "(OBESIDADE GRAU 1)");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println(nome + ", o seu IMC é de: " + df.format(imc) + "(OBESIDADE GRAU 2)");
		} else {
			System.out.println(nome + ", o seu IMC é de: " + df.format(imc) + "(OBESIDADE GRAU 3)");
		}
		
		sc.close();

	}

}
