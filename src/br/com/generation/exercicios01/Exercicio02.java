package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int anos, meses, dias;
		
		System.out.println("Digite quanto tempo de vida você possui em "
				+ "dias:");
		System.out.print("Dias: ");
		dias = read.nextInt();
		
		read.close();
		
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = dias - (anos * 365 + meses * 30);
		
		System.out.println("Você possui " + anos + " anos, "
				+ meses + " meses e " + dias + " dias.");
		
	}

}
