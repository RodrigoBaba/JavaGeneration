package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Digite um número: ");
		numero = read.nextDouble();
		
		read.close();
		
		if(numero % 2 == 0) {
			System.out.println("\nEste número é Par!");
			System.out.println("Sua raiz quadrada é " + Math.sqrt(numero));
		}
		else {
			System.out.println("\nEste número é Ímpar!");
			System.out.println(numero + "² é " + Math.pow(numero, 2));
		}
	}

}

