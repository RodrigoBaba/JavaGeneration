package br.com.generation.exercicios.classe01;


public class ClienteTesta {

	public static void main(String[] args) {

		
		Cliente cliente = new Cliente();
		
		System.out.println("Nome do(a) cliente: " + cliente.nomeCliente("Maria"));		

		System.out.println("Telefone do cliente: " + cliente.telefoneCliente("(11)97845-2135"));
			
		System.out.println("Cidade do(a) cliente: " + cliente.cidadeCliente("São Paulo"));
		
		System.out.println("\n| Nome do(a) cliente: " + cliente.nome + " | Telefone do cliente: " 
				+ cliente.telefone + " Km/h | Cidade do(a) cliente:  " + cliente.cidade + " |");
		
	}

}
