package br.com.generation.exercicios02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.println("Digite as notas:");
		System.out.println("1º nota: ");
		n1 = read.nextInt();
		
		System.out.println("2º nota: ");
		n2 = read.nextInt();
		
		while(n1 > 10 || n1 < 0 || n2 < 0 ||  n2 > 10) {
			System.out.println("\nVocê esta digitando notas que não são compatíveis !!!");
			System.out.println("1º nota: ");
			n1 = read.nextInt();			
			System.out.println("2º nota: ");
			n2 = read.nextInt();			
		}
		
		read.close();
		
		media = (n1 + n2) / 2;		
		
		if(media >= 7) {
			System.out.println("\nAprovado!!!");
			System.out.println("Sua média foi " + media);
		}
		else if(media >= 3 && media < 7) {
			System.out.println("\nRecuperação!!!");
			System.out.println("Sua média foi " + media);
		}
		else {
			System.out.println("\nReprovado!!!");
			System.out.println("Sua média foi " + media);
		}		
		
	}

}
