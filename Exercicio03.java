package lista02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o sal�rio atual:");
		float salario = sc.nextFloat();
		System.out.println("Digite o valor do Reajuste (Sem o '%' ");
		float reajuste = sc.nextFloat();
		
		float novoSalario = salario + (reajuste / 100 * salario);
		System.out.println("O novo sal�rio � de \n" + novoSalario);
	}
}
