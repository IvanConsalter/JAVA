
//ENTRA COM DADOS NO TECLADO E EXIBE NA TELA

package exercicios;

import java.util.Scanner;


public class Entrada_Saida_Dados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome completo: ");
		String nome = sc.nextLine();
		System.out.print("Endereço: ");
		String endereco = sc.nextLine();
		System.out.print("Cidade: ");
		String city = sc.nextLine();
		System.out.print("Estado: ");
		String estado = sc.nextLine();
		
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Cidade: " + city);
		System.out.println("Estado: " + estado);
		
		sc.close();

	}

}