package udemyAulas;

import java.util.Scanner;

public class Exercicio1Condicionais {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite um numero.");
		int number;
		number = keyboard.nextInt();
		
		
		if (number >= 0) {
			System.out.printf("O numbero %d ? positivo.", number);
		} else {
			System.out.printf("O numero %d ? negativo.", number);
		}
		
		keyboard.close();

	}

}
