package br.com.generation.exercicios.classe.heranca01;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		Polimorfismo som = new Polimorfismo();
		Animal cavalo = new Cavalo();
		AnimalInterface cav = new Cavalo();
		
		Animal dog = new Cachorro();
		AnimalInterface cachorro = new Cachorro();

		Animal preguica = new Preguica();
		AnimalInterface preg = new Preguica();
		
		System.out.print("Qual nome do seu cavalo: ");
		String nome = read.next();
		cavalo.setNome(nome);
		System.out.print("Qual idade do seu cavalo: ");
		int idade = read.nextInt();
		cavalo.setIdade(idade);
		
		System.out.println("\nSeu cavalo se chama " + cavalo.getNome());
		System.out.println("Seu cavalo tem " + cavalo.getIdade() + " anos");		
		som.somAnimal(new Cavalo());
		cavalo.correr();
		cav.comer();
		
		
		System.out.print("\nQual nome do seu cachorro: ");
		nome = read.next();
		dog.setNome(nome);
		System.out.print("Qual idade do seu cachorro: ");
		idade = read.nextInt();
		dog.setIdade(idade);
						
		System.out.println("\nSeu cachorro se chama " + dog.getNome());
		System.out.println("Seu cachorro tem " + dog.getIdade() + " anos");
		som.somAnimal(new Cachorro());
		dog.correr();
		cachorro.comer();

		
		System.out.print("\nQual o nome da preguiça: ");
		nome = read.next();
		preguica.setNome(nome);
		System.out.print("Qual idade da preguiça: ");
		idade = read.nextInt();
		preguica.setIdade(idade);
						
		System.out.println("\nA preguiça se chama " + preguica.getNome());
		System.out.println("A pregiça tem " + preguica.getIdade() + " anos");
		som.somAnimal(new Preguica());
		preguica.subirEmArvore();
		preg.comer();
		
		read.close();
		
	}

}
