package br.com.generation.aula01;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double n1, n2, resultado;
		
		System.out.println("Qual é o 1º número: ");
		n1 = read.nextDouble();
		
		System.out.println("Qual é o 2º número: ");
		n2 = read.nextDouble();
		
		System.out.println();
		
		resultado = n1 + n2;
		System.out.println("Resultado da soma é " + resultado);
		
		resultado = n1 - n2;
		System.out.println("Resultado da subtração é " + resultado);
		
		resultado = n1 * n2;
		System.out.println("Resultado da multiplicação é " + resultado);
		
		resultado = n1 / n2;
		System.out.println("Resultado da divisão é " + resultado);
		
		resultado = n1 % n2;
		System.out.println("Resultado da divisão é " + resultado);
		
		read.close();
		
	}
}
