package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Escreva os valores:");
		System.out.print("Valor A: ");
		a = read.nextDouble();
		System.out.print("Valor B: ");
		b = read.nextDouble();
		System.out.print("Valor C: ");
		c = read.nextDouble();
		System.out.print("Valor D: ");
		d = read.nextDouble();
		System.out.print("Valor E: ");
		e = read.nextDouble();
		System.out.print("Valor F: ");
		f = read.nextDouble();
		
		read.close();
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		
		System.out.println("O valor de X é " + x + " e o valor de Y é "
				+ y);
	}
}
