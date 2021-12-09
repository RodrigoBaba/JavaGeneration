package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

Scanner read = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite 3 números aleatório: ");
		System.out.print("1º número: ");
		n1 = read.nextInt();
		System.out.print("2º número: ");
		n2 = read.nextInt();
		System.out.print("3º número: ");
		n3 = read.nextInt();
		
		read.close();
		
		if(n1 >= n2 && n1 >= n3 && n2 >= n3) {
			System.out.println("Ordem crescente: " + n3 + " " + n2 + " " + n1);
		}
		else if(n1 >= n2 && n1 >= n3 && n3 >= n2) {
			System.out.println("Ordem crescente: " + n2 + " " + n3 + " " + n1);
		}
		else if(n2 >= n1 && n2 >= n3 && n1 >= n3) {
			System.out.println("Ordem crescente: " + n3 + " " + n1 + " " + n2);
		}
		else if(n2 >= n1 && n2 >= n3 && n3 >= n1) {
			System.out.println("Ordem crescente: " + n1 + " " + n3 + " " + n2);
		}
		else if(n3 >= n1 && n3 >= n2 && n1 >= n2) {
			System.out.println("Ordem crescente: " + n2 + " " + n1 + " " + n3);
		}
		else if(n3 >= n1 && n3 >= n2 && n2 >= n1) {
			System.out.println("Ordem crescente: " + n1 + " " + n2 + " " + n3);
		}		
	}

}
