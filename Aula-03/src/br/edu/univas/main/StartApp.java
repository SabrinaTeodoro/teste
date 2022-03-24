package br.edu.univas.main;

public class StartApp {
	public static void main (String[] args) {
		System.out.println("inicio");
		int idadeAtual = 18;
		if (idadeAtual >= 18) {
			System.out.println("Você é obrigado a votar");
		}
		if(idadeAtual < 18){
			System.out.println("Você nao é obrigado a votar");
		}
		System.out.println("fim");
		
		System.out.println("-------------");
		System.out.println("INICIO DO PROGRAMA DE HABILITAÇÃO");
		
		idadeAtual = 16;
		if (idadeAtual >= 18) {
			System.out.println("Voce pode tirar habilitação");
		}
		else { System.out.println("Voce nao pode tirar habilitação"); }
		/*else if (idadeAtual < 18) {
			System.out.println("Voce nao pode tirar habilitação");
		}*/
		
		System.out.println("FIM DO PROGRAMA DE HABILITAÇÃO");
		
		System.out.println("-------------");
		
		
		System.out.println("INICIO DO PROGRAMA DE VOTAÇAO 2.0");
		idadeAtual = 18;
		
		if (idadeAtual >= 18) {
			System.out.println("Você é obrigado a votar");
		}
		else if(idadeAtual >= 16){
			System.out.println("Você está habilitado a votar");
		}
		
		else{
			System.out.println("Você nao é obrigado a votar");
		}
		System.out.println("FINISHED");
		
		System.out.println("-------------");
	}
}
