package br.com.generation.exercicios03;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		char resposta;
		
		System.out.println("Você deseja comprar algum produto?(S/N)");
		char resposta1 = read.next().charAt(0);
		
		if(resposta1 == 'S' || resposta1 == 's') {
			
			int n;
						
			System.out.print("\nQuantos itens você irá inserir: ");
			n = read.nextInt();	
			
			String nome[] = new String[n];
			double preco[] = new double[n], totalQuantidade[] = new double[n], total = 0;
			int quantidade[] = new int[n];			
			
			if(n > 0) {
				for(int i = 0; i < n; i++) {
					System.out.print("\nQual o nome do #" + (i + 1) + " produto: ");
					nome[i] = read.next();
					System.out.print("Qual o preço do produto: ");
					preco[i] = read.nextDouble();
					System.out.print("Quantos você deseja comprar: ");
					quantidade[i] = read.nextInt();
				
					totalQuantidade[i] = preco[i] * quantidade[i];
					total += totalQuantidade[i];				
				}
				
				System.out.println("\nProdutos:");

				for(int i = 0; i < n; i++) {
					System.out.println((i + 1) + "# - " + nome[i] + ", preço unitário R$" + preco[i] + 
							", quantidade " + quantidade[i] + ", total: R$" + totalQuantidade[i]);
				}
				
				System.out.println("Valor total à ser pago: R$" + total);
				
				
				System.out.println("\nVocê deseja adicionar algum item ou remover?(S/N)");
				resposta = read.next().charAt(0);

				if(resposta == 'S' || resposta == 's') {
					System.out.println("\nVocê deseja adicionar(A) ou remover(R)?(A/R)");
					char resp = read.next().charAt(0);
					if(resp == 'A' || resp == 'a') {
						System.out.print("\nQuantos produtos você deseja adicionar: ");
						int add = read.nextInt();						
						
						String nomeAdd[] = new String[add];
						double precoAdd[] = new double[add], totalQuantidadeAdd[] = new double[add];
						int quantidadeAdd[] = new int[add];	
						
						for(int i = 0 ; i < add; i++) {
							System.out.print("\nQual o nome do #" + (i + n + 1) + " produto: ");
							nomeAdd[i] = read.next();
							System.out.print("Qual o preço do produto: ");
							precoAdd[i] = read.nextDouble();
							System.out.print("Quantos você deseja comprar: ");
							quantidadeAdd[i] = read.nextInt();
							
							totalQuantidadeAdd[i] = precoAdd[i] * quantidadeAdd[i];
							total += totalQuantidadeAdd[i];
						}
						System.out.println("\nProdutos:");

						for(int i = 0; i < n; i++) {
							System.out.println((i + 1) + "# - " + nome[i] + ", preço unitário R$" + preco[i] + 
									", quantidade " + quantidade[i] + ", total: R$" + totalQuantidade[i]);
						}
						for(int i = 0; i < add; i++) {
							System.out.println((i + n + 1) + "# - " + nomeAdd[i] + ", preço unitário R$" + precoAdd[i] + 
									", quantidade " + quantidadeAdd[i] + ", total: R$" + totalQuantidadeAdd[i]);
						}
						System.out.println("Valor total à ser pago: R$" + total);
					}
					else if(resp == 'R' || resp == 'r') {
						System.out.println("\nQual o número do produto que você deseja remover: ");
						int numero = read.nextInt();
						
						for(int i = 0; i < n; i++) {
							if(numero == (i + 1)) {
								total -= totalQuantidade[i];						
								nome[i] = "Cancelado";
								preco[i] = 0.0;
								quantidade[i] = 0;	
								totalQuantidade[i] = 0.0;
							}
						}
						System.out.println("\nDeseja remover mais algum produto?(S/N): ");
						char resp1 = read.next().charAt(0);
						while(resp1 == 'S' || resp1 == 's') {
							System.out.println("\nQual o número do produto que você deseja remover: ");
							numero = read.nextInt();
							
							for(int i = 0; i < n; i++) {
								if(numero == (i + 1)) {
									total -= totalQuantidade[i];
									nome[i] = "Cancelado";
									preco[i] = 0.0;
									quantidade[i] = 0;
									totalQuantidade[i] = 0.0;
								}
							}
							System.out.println("\nDeseja remover mais algum produto?(S/N): ");
							resp1 = read.next().charAt(0);
						}
						System.out.println("\nProdutos:");
						for(int i = 0; i < n; i++) {
							System.out.println((i + 1) + "# - " + nome[i] + ", preço unitário R$" + preco[i] + 
									", quantidade " + quantidade[i] + ", total: R$" + totalQuantidade[i]);
						}
						System.out.println("Valor total à ser pago: R$" + total);
					}
					
				}
				
				System.out.println("\nQual a forma de pagamento?\n1 - Dinheiro\n2 - Débito\n3 - Crédito");
				int pagamento = read.nextInt();		
				
				if(pagamento == 1) {
					System.out.println("\nQual o valor em notas você irá pagar: ");
					double valor = read.nextDouble();
					double receber = valor - total;
					System.out.println("\nO seu troco é de R$" + receber);
					System.out.println("Obrigado pela compra!");

				}
				else if(pagamento == 2 || pagamento == 3) {
					System.out.println("\nDigite sua senha por favor.");
					System.out.println("Obrigado pela compra!");
				}
				
			}			
		}
		else{
			System.out.println("\nO senhor(a) não comprou nenhum produto!");
		}
		
		read.close();
	}

}
