package br.com.generation.exercicios.classe.heranca01;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		Cavalo cavalo = new Cavalo();
		Cachorro dog = new Cachorro();
		Preguica preguica = new Preguica();
		
		System.out.print("Qual nome do seu cavalo: ");
		String nome = read.next();
		cavalo.setNome(nome);
		System.out.print("Qual idade do seu cavalo: ");
		int idade = read.nextInt();
		cavalo.setIdade(idade);		
		
		System.out.println("\nSeu cavalo se chama " + cavalo.getNome());
		System.out.println("Seu cavalo tem " + cavalo.getIdade() + " anos");
		cavalo.som();
		cavalo.correr();
		
		
		
		System.out.print("\nQual nome do seu cachorro: ");
		nome = read.next();
		dog.setNome(nome);
		System.out.print("Qual idade do seu cachorro: ");
		idade = read.nextInt();
		dog.setIdade(idade);
						
		System.out.println("\nSeu cachorro se chama " + dog.getNome());
		System.out.println("Seu cachorro tem " + dog.getIdade() + " anos");
		dog.som();
		dog.correr();

		
		System.out.print("\nQual o nome da pregui�a: ");
		nome = read.next();
		preguica.setNome(nome);
		System.out.print("Qual idade da pregui�a: ");
		idade = read.nextInt();
		preguica.setIdade(idade);
						
		System.out.println("\nA pregui�a se chama " + preguica.getNome());
		System.out.println("A pregi�a tem " + preguica.getIdade() + " anos");
		preguica.som();
		preguica.subirEmArvore();
		
		read.close();
		
	}

}
