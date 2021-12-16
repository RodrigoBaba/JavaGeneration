package br.com.generation.exercicios.classe.heranca01;

public class Cavalo extends Animal implements AnimalInterface{

	public void som() {
		System.out.println("O cavalo está relinchando .....");
	}
	
	public void correr() {
		System.out.println("O cavalo está correndo ....");
	}

	@Override
	public void comer() {
		System.out.println("O cavalo está comendo ....");		
	}
	
}
