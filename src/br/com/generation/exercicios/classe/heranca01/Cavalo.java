package br.com.generation.exercicios.classe.heranca01;

public class Cavalo extends Animal implements AnimalInterface{

	public void som() {
		System.out.println("O cavalo est� relinchando .....");
	}
	
	public void correr() {
		System.out.println("O cavalo est� correndo ....");
	}

	@Override
	public void comer() {
		System.out.println("O cavalo est� comendo ....");		
	}
	
}
