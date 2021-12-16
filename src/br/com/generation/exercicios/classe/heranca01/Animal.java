package br.com.generation.exercicios.classe.heranca01;

public abstract class Animal {

	private String nome;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
		
	
	public  void som() {
		System.out.println("O animal est� fazendo um som!!");
	}
	
	public  void correr() {
		System.out.println("O animal est� correndo ....");
		
	}
	
	public  void subirEmArvore() {
		System.out.println("O animal est� subindo na �rvore ...");
	}
}
