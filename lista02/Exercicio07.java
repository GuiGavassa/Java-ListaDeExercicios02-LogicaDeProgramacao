package lista02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite qual a altura da lata:");
		float alturaLata = sc.nextFloat();
		
		System.out.println("Digite qual o raio da lata:");
		float raioLata = sc.nextFloat();
		
		float volumeLata = (float) ((Math.PI) * (Math.pow(raioLata, 2) * alturaLata));
		
		System.out.println("O volume da lata é igual a: " + volumeLata);
		
	}

}
