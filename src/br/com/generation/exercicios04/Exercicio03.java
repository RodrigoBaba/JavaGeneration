package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double n1[][] = new double[4][6], n2[][] = new double[4][6], 
			   m1[][] = new double[4][6], m2[][] = new double[4][6];
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.println("Digite o valor da posição [" + l + "/" 
						+ c + "] na 1º matriz: ");
				n1[l][c] = read.nextDouble();
				System.out.println("Digite o valor da posição [" + l + "/" 
						+ c + "] na 2º matriz: ");
				n2[l][c] = read.nextDouble();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
			System.out.println();
		}
		
		System.out.println("Matriz da soma:");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print(m1[l][c] + " |");
			}		
		}
		
		System.out.println();
		System.out.println("\nMatriz da subtração:");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print(m2[l][c] + " |");
			}		
		}
		
		read.close();
	}

}
