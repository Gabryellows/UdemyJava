package udemyAulas;

import java.util.Scanner;

public class Exercicio3Condicionais {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Digite dois valores.");
		int value1, value2;
		value1 = keyboard.nextInt();
		value2 = keyboard.nextInt();
		
		if(value1 % value2 == 0 || value2 % value1 == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		keyboard.close();
	}
}