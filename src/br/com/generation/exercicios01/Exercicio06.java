package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double x1, x2, y1, y2, resultadoD;
		
		System.out.println("Escreva as coordenadas:");
		System.out.print("X1: ");
		x1 = read.nextDouble();
		System.out.print("X2: ");
		x2 = read.nextDouble();
		System.out.print("Y1: ");
		y1 = read.nextDouble();
		System.out.print("Y2: ");
		y2 = read.nextDouble();
		
		read.close();
		
		resultadoD = Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0);		
		resultadoD = Math.sqrt(resultadoD);		
		
		System.out.println("A distância é " + resultadoD);
	}
}
