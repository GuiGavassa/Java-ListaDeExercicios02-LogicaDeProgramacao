package lista02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de horas que o carro viajou:");
		float horasViagem = sc.nextFloat();
		
		System.out.println("Digite a velocidade média do carro em Km/h:");
		float velocidade = sc.nextFloat();
		
		float distancia = horasViagem * velocidade;
		float litrosUsados = Math.round(distancia / 12);
		
		System.out.println("A quantidade de litros usados é de:" + litrosUsados + "L");

	}

}
