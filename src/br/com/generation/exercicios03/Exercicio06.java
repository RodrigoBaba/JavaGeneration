package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int number, sum = 0;
		double count = 0, media;	
		
		System.out.print("Digite um número: ");
		number = read.nextInt();

		if(number != 0) {
			do {
				if(number % 3 == 0) {
					sum += number;
					count++;
				}
				System.out.print("Digite um número: ");
				number = read.nextInt();				
			}
			while(number != 0);
			media = sum / count;
		}
		else {
			media = 0.0;
		}		
		
		read.close();
		
		System.out.println("\nA soma dos número múltiplos de [3] foi " + sum + " e sua média é " + media);
	}

}

