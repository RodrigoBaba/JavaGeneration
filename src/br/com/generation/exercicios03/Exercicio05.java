package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = read.nextInt();
			soma += numero;
			
		}
		while(numero != 0);
		
		read.close();
		
		System.out.println("\nO total da soma foi " + soma);
			
	}

}