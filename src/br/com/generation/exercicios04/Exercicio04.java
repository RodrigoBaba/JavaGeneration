package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double valor[][] = new double[3][3], soma = 0.0, diagonalPrincipal = 0.0;
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.print("Digite o valor na posição [" + l + "/"
						+ c + "]: ");
				valor[l][c] = read.nextDouble();
				
				soma += valor[l][c];
				
				if(l == c) {
					diagonalPrincipal += valor[l][c];
				}
			}
			System.out.println();
		}
		
		System.out.println("\nSoma total : " + soma);
		System.out.println("Soma na diagonal principal: " + diagonalPrincipal);
		
		read.close();
	}

}
