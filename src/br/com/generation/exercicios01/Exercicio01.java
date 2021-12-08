package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int anos, meses, dias;
		
		System.out.println("Digite quanto tempo de vida você possui em "
				+ "anos/meses/dias:");
		System.out.print("Anos: ");
		anos = read.nextInt();
		System.out.print("Meses: ");
		meses = read.nextInt();
		System.out.print("Dias: ");
		dias = read.nextInt();
		
		read.close();
			
		anos = anos * 365;
		meses = meses * 30;
		dias += anos + meses;
		
		System.out.println("\nVocê possui " + dias + " dias de vida.");
		
	}

}
