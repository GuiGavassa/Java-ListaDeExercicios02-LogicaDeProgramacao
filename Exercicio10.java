package lista02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		float a = sc.nextFloat();
		
		System.out.println("Digite o valor de B:");
		float b = sc.nextFloat();
		
		float c = a;
		
		a = b;
		b = c;
		System.out.println("Agora, o valor de A é: " + a);
		System.out.println("E o valor de B é: " + b);
	}
}
