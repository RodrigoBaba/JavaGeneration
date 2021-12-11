package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {			
		
		int x, par[] = new int[10], impar[] = new int[10], contadorPar = 0, contadorImpar = 0;		
		
		Scanner read = new Scanner(System.in);		
		
		for(int y = 0; y < 10; y++) {			
			System.out.print("Insira o valor: ");
			x = read.nextInt();			

			if(x % 2 == 0) {
				System.out.println(x + " é par!");
				contadorPar++;
				par[y] = x;
			}
			else{
				System.out.println(x + " é ímpar!");
				contadorImpar++;
				impar[y] = x;
			}
			System.out.println();
		}		
		System.out.println("\nForam repetido : " + contadorPar + " o número par!");
		System.out.println("Foram repetido : " + contadorImpar + " o número ímpar!");		
		read.close();
		
		System.out.println("\nOs números pares que você digitou(Excluindo o numero zero): ");
		for(int i = 0; i < 10; i++) {
			if(par[i] != 0) {
			System.out.print(par[i] + " ");
			}
		}
		System.out.println("\nOs números ímpares que você digitou: ");
		for(int i = 0; i < 10; i++) {
			if(impar[i] != 0) {
				System.out.print(impar[i] + " ");				
			}			
		}
	}
}
