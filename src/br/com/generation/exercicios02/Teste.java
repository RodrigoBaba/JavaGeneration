package br.com.generation.exercicios02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.println("Digite as notas:");
		System.out.println("1� nota: ");
		n1 = read.nextInt();
		
		System.out.println("2� nota: ");
		n2 = read.nextInt();
		
		while(n1 > 10 || n1 < 0 || n2 < 0 ||  n2 > 10) {
			System.out.println("\nVoc� esta digitando notas que n�o s�o compat�veis !!!");
			System.out.println("1� nota: ");
			n1 = read.nextInt();			
			System.out.println("2� nota: ");
			n2 = read.nextInt();			
		}
		
		read.close();
		
		media = (n1 + n2) / 2;		
		
		if(media >= 7) {
			System.out.println("\nAprovado!!!");
			System.out.println("Sua m�dia foi " + media);
		}
		else if(media >= 3 && media < 7) {
			System.out.println("\nRecupera��o!!!");
			System.out.println("Sua m�dia foi " + media);
		}
		else {
			System.out.println("\nReprovado!!!");
			System.out.println("Sua m�dia foi " + media);
		}		
		
	}

}
