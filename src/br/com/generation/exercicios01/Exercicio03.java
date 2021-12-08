package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int horas, minutos, segundos;
		
		System.out.println("Quanto segundos durou o evento: ");
		segundos = read.nextInt();
		
		read.close();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = segundos - (horas * 3600 + minutos * 60);
		
		System.out.println("Você possui " + horas + " horas, "
				+ minutos + " minutos e " + segundos + " segundos.");
				
	}

}
