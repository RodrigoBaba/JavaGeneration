package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double valor[] = new double[5], maior = 0.0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Escreva o " + (i + 1) + "º valor: ");
			valor[i] = read.nextDouble();
			
			if(valor[i] >= maior) {
				maior = valor[i];
			}
		}
		System.out.println("\nO maior valor que você digitou é " + maior);
		
		read.close();
	}

}
