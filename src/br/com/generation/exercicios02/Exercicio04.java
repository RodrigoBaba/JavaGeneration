package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Digite um n�mero: ");
		numero = read.nextDouble();
		
		read.close();
		
		if(numero % 2 == 0) {
			System.out.println("\nEste n�mero � Par!");
			System.out.println("Sua raiz quadrada � " + Math.sqrt(numero));
		}
		else {
			System.out.println("\nEste n�mero � �mpar!");
			System.out.println(numero + "� � " + Math.pow(numero, 2));
		}
	}

}

