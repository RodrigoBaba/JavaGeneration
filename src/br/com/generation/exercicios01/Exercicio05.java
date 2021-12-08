package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Digite suas notas:");
		System.out.print("1º nota: ");
		n1 = read.nextDouble();
		System.out.print("2º nota: ");
		n2 = read.nextDouble();
		System.out.print("3º nota: ");
		n3 = read.nextDouble();
		
		read.close();
		
		n1 = n1 * 0.2;
		n2 = n2 * 0.3;
		n3 = n3 * 0.5;
		
		System.out.println("Sua nota final " + (n1 + n2 + n3));
				
	}

}
