package br.com.generation.exercicios.classe.heranca01;

public class Preguica extends Animal implements AnimalInterface{

	public void som() {
		System.out.println("A preguiça está dormindo zZzZzZzZ");
	}
	
	public void subirEmArvore() {
		System.out.println("A preguiça está subindo na árvore ...");
	}

	@Override
	public void comer() {
		System.out.println("A preguiça está comendo .....");
	}
	
	
}
