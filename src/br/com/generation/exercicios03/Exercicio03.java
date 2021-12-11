package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int menor = 0, maior = 0, idade = 0;		
		
		while(idade != -99) {
			if(idade >= 0 && idade < 21) {
				menor++;
			}
			else if(idade > 50) {
				maior++;
			}
			System.out.print("Digite sua idade: ");
			idade = read.nextInt();			
		}
		
		read.close();
		
		System.out.println("\nTotal de pessoas com menos de 21 anos foi " + menor);
		System.out.println("Total de pessoas com mais de 50 anos foi " + maior);
	}
}
