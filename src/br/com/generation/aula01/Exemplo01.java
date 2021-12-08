package br.com.generation.aula01;

import java.util.Scanner;

public class Exemplo01 {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int galoes;
		double litros;
		
		System.out.println("Quantos galões você possui: ");
		galoes = read.nextInt();
		
		litros = galoes * 3.785;
		
		System.out.println(galoes + " galões são: " + litros + " litros.");
		
		read.close();
		
		
	}

}
