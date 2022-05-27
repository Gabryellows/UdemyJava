package udemyAulas;

import java.util.Scanner;

public class Exercicio1LP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number1, number2, sum;
		
		System.out.println("Por favor digite o primeiro numero:");
		number1 = sc.nextInt();
		System.out.println("E agora digite o segundo numero:");
		number2 = sc.nextInt();
		
		sum = number1 + number2;
		System.out.printf("O numero %d somado com o numero %d%n", number1, number2);
		System.out.println("da a SOMA de = " + sum);
		
		sc.close();

	}
	
}