package br.com.generation.aula01;

import java.util.Scanner;

public class Exemplo01 {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int galoes;
		double litros;
		
		System.out.println("Quantos gal�es voc� possui: ");
		galoes = read.nextInt();
		
		litros = galoes * 3.785;
		
		System.out.println(galoes + " gal�es s�o: " + litros + " litros.");
		
		read.close();
		
		
	}

}
