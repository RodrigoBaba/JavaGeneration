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
				System.out.println(x + " � par!");
				contadorPar++;
				par[y] = x;
			}
			else{
				System.out.println(x + " � �mpar!");
				contadorImpar++;
				impar[y] = x;
			}
			System.out.println();
		}		
		System.out.println("\nForam repetido : " + contadorPar + " o n�mero par!");
		System.out.println("Foram repetido : " + contadorImpar + " o n�mero �mpar!");		
		read.close();
		
		System.out.println("\nOs n�meros pares que voc� digitou(Excluindo o numero zero): ");
		for(int i = 0; i < 10; i++) {
			if(par[i] != 0) {
			System.out.print(par[i] + " ");
			}
		}
		System.out.println("\nOs n�meros �mpares que voc� digitou: ");
		for(int i = 0; i < 10; i++) {
			if(impar[i] != 0) {
				System.out.print(impar[i] + " ");				
			}			
		}
	}
}
