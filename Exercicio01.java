package lista02;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia do seu nascimento");
		int dia = sc.nextInt();
		
		System.out.println("Digite o mês do seu nascimento");
		int mes = sc.nextInt();
		
		System.out.println("Digite o ano do seu nascimento");
		int ano = sc.nextInt();
		
		int anoAtual = YearMonth.now().getYear();
		int mesAtual = YearMonth.now().getMonthValue();
		
		Calendar cal = Calendar.getInstance();
		
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		
		
		int difAno = anoAtual -  ano;
		
		int difMes = mes - mesAtual;
		
		if (difMes<0) {
			difMes = difMes * (-1);
		}
		
		int difDias = dia - diaAtual;
		
		if (difDias<0) {
			difDias = difDias * (-1);
		}
		
			int idadedias = (difAno * 365) + (difMes * 30) + difDias;
			System.out.println("A sua idade em dias é de:" + idadedias);

	}

}
