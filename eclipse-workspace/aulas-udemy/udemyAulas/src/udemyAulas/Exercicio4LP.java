package udemyAulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4LP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int idWorker, hoursWorked;
		double salary;
		
		System.out.println("Olah, digite seu registro:");
		idWorker = sc.nextInt();
		
		System.out.println("Agora as horas trabalhadas neste mes:");
		hoursWorked = sc.nextInt();
		
		System.out.println("O valor que recebe por hora:");
		salary = sc.nextDouble();
		
		
		
		System.out.printf("Seu registro ?: %d %nSeu salario esse mes conforme suas %d horas trabalhadas eh de: U$ %.2f", idWorker, hoursWorked ,salary * hoursWorked);
		
		
		sc.close();

	}

}
