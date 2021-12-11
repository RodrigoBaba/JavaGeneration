package br.com.generation.exercicios02;

import java.util.Scanner;

public class Teste02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		String numero, telefone = "";
		int contagem = 0;
		
		System.out.println("Digite seu número de telefone:");
		numero = read.next();
		
		while(contagem < 8) {
		switch(numero) {
		case "0":
			telefone = telefone + numero;
			break;
		case "1":
			telefone = telefone + numero;
			break;
		case "2":
			telefone = telefone + numero;
			break;
		case "3":
			telefone = telefone + numero;
			break;
		case "4":
			telefone = telefone + numero;
			break;
		case "5":
			telefone = telefone + numero;
			break;
		case "6":
			telefone = telefone + numero;
			break;
		case "7":
			telefone = telefone + numero;
			break;
		case "8":
			telefone = telefone + numero;
			break;
		case "9":
			telefone = telefone + numero;
			break;
			}
		numero = read.next();
		contagem++;
		}
		read.close();
		
		System.out.println("\nSeu número de telefone: " + telefone);
		
	}

}
