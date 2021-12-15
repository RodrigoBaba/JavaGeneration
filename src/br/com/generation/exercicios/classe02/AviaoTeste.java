package br.com.generation.exercicios.classe02;

public class AviaoTeste {

	public static void main(String[] args) {

		Aviao aviao = new Aviao();
		
		System.out.println("O modelo do avião é " + aviao.modeloAviao("Lear 25."));
		System.out.println("Velocidade máxima: " + aviao.velocidadeMaxAviao(500) + " Km/h.");
		System.out.println("Número de passageiros é " + aviao.quantidadePassageiro(10) + " passageiros.");
		
		System.out.println("\n| O modelo do avião é " + aviao.modelo + " | Velocidade máxima: " 
				+ aviao.velocidadeMax + " Km/h | Número de passageiros é " + aviao.numeroPassageiro + " passageiros |");		
	}

}
