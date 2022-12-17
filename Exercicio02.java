package lista02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a quantidade total de eleitores do município.");
		int eleitores = sc.nextInt();
		System.out.println("Escreva a quantidade de votos brancos.");
		int votosBrancos = sc.nextInt();
		System.out.println("Escreva a quantidade de votos nulos");
		int votosNulos = sc.nextInt();
		System.out.println("Escreva a quantidade de votos validos");
		int votosValidos = sc.nextInt();

		
		int votosBrancosPorCento = (votosBrancos * 100)/ eleitores;
		int votosNulosPorCento = (votosNulos * 100)/ eleitores;
		int votosValidosPorCento = (votosValidos * 100)/ eleitores;
		
		System.out.println(votosBrancosPorCento + "% dos votos foram brancos");
		System.out.println(votosNulosPorCento + "% dos votos foram nulos");
		System.out.println(votosValidosPorCento + "% dos votos foram validos");
		
		
		
	}

}
