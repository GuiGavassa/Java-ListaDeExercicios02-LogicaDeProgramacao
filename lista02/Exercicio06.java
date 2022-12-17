package lista02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma temperatura em Fahrenheit");
		float fahrenheit = sc.nextFloat();
		
		float celsius = (fahrenheit - 32) * (5 / 9);
		
		System.out.println("A temperatura em celsius é:" + celsius);
	}
}
