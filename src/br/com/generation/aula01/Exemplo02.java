package br.com.generation.aula01;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double n1, n2, resultado;
		
		System.out.println("Qual � o 1� n�mero: ");
		n1 = read.nextDouble();
		
		System.out.println("Qual � o 2� n�mero: ");
		n2 = read.nextDouble();
		
		System.out.println();
		
		resultado = n1 + n2;
		System.out.println("Resultado da soma � " + resultado);
		
		resultado = n1 - n2;
		System.out.println("Resultado da subtra��o � " + resultado);
		
		resultado = n1 * n2;
		System.out.println("Resultado da multiplica��o � " + resultado);
		
		resultado = n1 / n2;
		System.out.println("Resultado da divis�o � " + resultado);
		
		resultado = n1 % n2;
		System.out.println("Resultado da divis�o � " + resultado);
		
		read.close();
		
	}
}
