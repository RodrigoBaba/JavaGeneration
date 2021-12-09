package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = read.nextInt();
		
		read.close();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Você está na categoria infantil!");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Você está na categoria juvenil!");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Você está na categoria adulto!");
		}
		else if(idade < 10) {
			System.out.println("Você ainda não tem idade para nenhuma categoria!");
		}
		else {
			System.out.println("Infelizmente você ja ultrapassou a categoria adulto!");
		}
	}

}
