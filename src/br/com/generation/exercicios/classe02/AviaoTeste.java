package br.com.generation.exercicios.classe02;

public class AviaoTeste {

	public static void main(String[] args) {

		Aviao aviao = new Aviao();
		
		System.out.println("O modelo do avi�o � " + aviao.modeloAviao("Lear 25."));
		System.out.println("Velocidade m�xima: " + aviao.velocidadeMaxAviao(500) + " Km/h.");
		System.out.println("N�mero de passageiros � " + aviao.quantidadePassageiro(10) + " passageiros.");
		
		System.out.println("\n| O modelo do avi�o � " + aviao.modelo + " | Velocidade m�xima: " 
				+ aviao.velocidadeMax + " Km/h | N�mero de passageiros � " + aviao.numeroPassageiro + " passageiros |");		
	}

}
