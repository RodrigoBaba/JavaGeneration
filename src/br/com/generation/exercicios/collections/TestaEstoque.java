package br.com.generation.exercicios.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		 ArrayList<Estoque> list = new ArrayList<>();
		
		System.out.print("Quanto produtos irá adicionar: ");
		int n = read.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("\n" + i + "º Qual nome do produto: ");
			String nome = read.next();			
			read.nextLine();
			
			System.out.print("Quantos: ");
			int qtd = read.nextInt();			
			
			System.out.print("Qual preço: ");
			double price = read.nextDouble();
			
			list.add(new Estoque(nome, qtd, price));
		}
		
		System.out.println();
		System.out.println("Estoque:");
		for(Estoque al : list) {			
			System.out.println(al);			
		}
		
		System.out.print("\nQual item você deseja remover(número do produto): ");
		int numero = read.nextInt();
		
		for(int i = 0; i < list.size(); i++) {
			if(numero == (i + 1)) {
				list.remove(i);
				System.out.println("Você removeu o item " + (i + 1));
			}			
		}
		
		System.out.println();
		System.out.println("Estoque:");
		for(Estoque al : list) {			
			System.out.println(al);			
		}
		

		read.close();
		
	}	
}
