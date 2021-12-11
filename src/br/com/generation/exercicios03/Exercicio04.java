package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int idade, sexo, opcao, contador = 150, calmas = 0, femNervosas = 0, mascAgressivos = 0, outrosCalmo = 0, maiorNervoso = 0, 
				menorCalmo = 0;
		
		Scanner read = new Scanner(System.in);
		
		while(contador > 0) {
			System.out.println("Qual é a sua idade: ");
			idade = read.nextInt();
			System.out.print("\n1 - Feminino\n2 - Masculino\n3 - Outros\nSelecione seu sexo: ");
			sexo = read.nextInt();
			System.out.print("\n1 - Pessoa era calma;\n2 - Pessoa era nervosa"
					+ "\n3 - Pessoa era agressiva\nSelecione uma opção: ");
			opcao = read.nextInt();
			
			if(opcao == 1) {				
				calmas++;
			}
			if(sexo == 1 && opcao == 2) {
				femNervosas++;
			}
			if(sexo == 2 && opcao == 3) {
				mascAgressivos++;
			}
			if(sexo == 3 && opcao == 1) {
				outrosCalmo++;
			}
			if(idade > 40 && opcao == 2) {
				maiorNervoso++;
			}
			if(opcao == 1 && idade < 18) {
				menorCalmo++;
			}			
			contador--;
			System.out.println();
			System.out.println();

		}
		System.out.println("\nO número de pessoas calmas: " + calmas);
		System.out.println("O número de mulheres nervosas: " + femNervosas);
		System.out.println("O número de homens agressivos: " + mascAgressivos);
		System.out.println("O número de outros calmos: " + outrosCalmo);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + maiorNervoso);
		System.out.println("O número de pessoas calmas com menos de 18 anos: " + menorCalmo);
		
		read.close();
		
	}

}
