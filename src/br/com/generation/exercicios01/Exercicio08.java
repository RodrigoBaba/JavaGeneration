package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double valorFabrica;
		
		System.out.print("Escreva o valor de fábrica: ");
		valorFabrica = read.nextDouble();
		
		read.close();
		
		valorFabrica = valorFabrica + (valorFabrica * 0.28);
		valorFabrica = valorFabrica + (valorFabrica * 0.45);
		
		System.out.println("Com todas as taxas de impostos o valor passou à ser "
				+ "R$" + valorFabrica + " reais.");
	
		
	}

}
