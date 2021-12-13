package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int value[] = new int[10], count = 0, larger = 0;
		double average = 0,  sum = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Insira o valor do #" + (i + 1) + " lan�amento: " );
			value[i] = read.nextInt();
			
			if(value[i] <= 0 || value[i] > 6) {
				System.out.println("\nVoc� digitou um valor imposs�vel para um dado de 6!\nDigite novamente por favor!");
				i--;				
				System.out.println();
			}
			else if(value[i] > 0 || value[i] <= 6) {
				sum += value[i];
					if(value[i] > larger) {
						larger = value[i];
					}
			}
						
		}
		
		for(int i = 0; i < 10; i++) {
			if(value[i] == larger) {
				count++;
			}
		}
		
		average = sum / value.length;
		
		System.out.println("\nM�dia artm�tica dos lan�amentos � " + average);
		System.out.println("A maior pontua��o foi " + larger + " e ela apareceu "
				+ count + " vezes!");
		read.close();
	}

}
