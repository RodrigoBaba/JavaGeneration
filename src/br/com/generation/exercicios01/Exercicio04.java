package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
				
		int n1, n2, n3, resultadoR, resultadoS, resultadoD;
		
		System.out.println("Digite os valores de A, B e C:");
		System.out.print("A: ");
		n1 = read.nextInt();
		System.out.print("B: ");
		n2 = read.nextInt();
		System.out.print("C: ");
		n3 = read.nextInt();
		
		read.close();
		
		resultadoR = (n1 + n2) * (n1 + n2); //16
		resultadoS = (n2 + n3) * (n2 + n3); //16
		
		resultadoD = (resultadoR + resultadoS) / 2;
		
		System.out.println("\nO valor de D é " + resultadoD);
		
	}

}
