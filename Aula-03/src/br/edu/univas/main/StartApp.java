package br.edu.univas.main;

public class StartApp {
	public static void main (String[] args) {
		System.out.println("inicio");
		int idadeAtual = 18;
		if (idadeAtual >= 18) {
			System.out.println("Voc� � obrigado a votar");
		}
		if(idadeAtual < 18){
			System.out.println("Voc� nao � obrigado a votar");
		}
		System.out.println("fim");
		
		System.out.println("-------------");
		System.out.println("INICIO DO PROGRAMA DE HABILITA��O");
		
		idadeAtual = 16;
		if (idadeAtual >= 18) {
			System.out.println("Voce pode tirar habilita��o");
		}
		else { System.out.println("Voce nao pode tirar habilita��o"); }
		/*else if (idadeAtual < 18) {
			System.out.println("Voce nao pode tirar habilita��o");
		}*/
		
		System.out.println("FIM DO PROGRAMA DE HABILITA��O");
		
		System.out.println("-------------");
		
		
		System.out.println("INICIO DO PROGRAMA DE VOTA�AO 2.0");
		idadeAtual = 18;
		
		if (idadeAtual >= 18) {
			System.out.println("Voc� � obrigado a votar");
		}
		else if(idadeAtual >= 16){
			System.out.println("Voc� est� habilitado a votar");
		}
		
		else{
			System.out.println("Voc� nao � obrigado a votar");
		}
		System.out.println("FINISHED");
		
		System.out.println("-------------");
	}
}
