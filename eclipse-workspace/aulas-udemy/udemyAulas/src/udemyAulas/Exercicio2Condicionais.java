package udemyAulas;

import java.util.Scanner;

public class Exercicio2Condicionais {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite um numero.");
		int number;
		number = keyboard.nextInt();
		
		if (number % 2 == 0) {
			System.out.printf("O numero %d é par", number);
		} else {
			System.out.printf("O numero %d é impar", number);
		}
		
		keyboard.close();
	}

}
