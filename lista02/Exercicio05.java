package lista02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite alguma temperatura em Celsius");
		float celsius = sc.nextFloat();
		
		float fahrenheit = (9 * celsius + 160)/5;
		
		System.out.println("Convertendo a temperatura para Fahrenheit...");
		System.out.println("=-=-=-=-=-=-=-=");
		System.out.println("Conversão completa. -> A temperatura em Fahrenheit é de: " + fahrenheit);
		
	}

}
