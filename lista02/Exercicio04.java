package lista02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo de fabrica de um carro");
		float custoFabricacao = sc.nextFloat();
		float custoDistribuidora = (custoFabricacao * 28) / 100;
		float custoImposto = (custoFabricacao * 45) / 100;
			
		float custoFinal = custoFabricacao + custoDistribuidora + custoImposto;
		
		System.out.println("O custo para o consumidor é de: R$" + custoFinal);	
	}
}
