package br.com.generation.exercicios.classe02;

public class Aviao {

	public String modelo;
	public int velocidadeMax;
	public int numeroPassageiro;
		 
	
	public String modeloAviao(String aviaoModelo) {
		modelo = aviaoModelo;
		return aviaoModelo;
	}

	public int velocidadeMaxAviao(int velocidade) {
		velocidadeMax = velocidade;
		return velocidade;
	}

	public int quantidadePassageiro(int passageiros) {
		numeroPassageiro = passageiros;
		return passageiros;
	}
	
	
	
}
