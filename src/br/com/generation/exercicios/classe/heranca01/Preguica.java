package br.com.generation.exercicios.classe.heranca01;

public class Preguica extends Animal implements AnimalInterface{

	public void som() {
		System.out.println("A pregui�a est� dormindo zZzZzZzZ");
	}
	
	public void subirEmArvore() {
		System.out.println("A pregui�a est� subindo na �rvore ...");
	}

	@Override
	public void comer() {
		System.out.println("A pregui�a est� comendo .....");
	}
	
	
}
