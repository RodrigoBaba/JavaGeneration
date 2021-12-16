package br.com.generation.exercicios.classe.heranca01;

public class Cachorro extends Animal implements AnimalInterface{

	public  void som() {
		System.out.println("O cachorro está latindo .....");
	}
	
	public  void correr() {
		System.out.println("O cachorro está correndo ....");
		
	}

	@Override
	public void comer() {
		System.out.println("Cachorro está comendo ....");
		
	}	
}
