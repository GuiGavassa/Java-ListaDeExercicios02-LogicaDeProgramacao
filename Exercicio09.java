package lista02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prestação inicial");
		float valorIni = sc.nextFloat();
		
		System.out.println("Digite o tempo de atraso em meses");
		float tempoAtraso = sc.nextFloat();
		
		System.out.println("Digite o valor da taxa");
		float taxa = sc.nextFloat();
		
		
		float valorFinal = valorIni + (valorIni * taxa / 100) * tempoAtraso;
		System.out.println("O valor final, após as taxas de atrasos, é de:" + valorFinal);
	}

}
