package udemyAulas;

import java.util.Scanner;

public class Exercicio4Condicionais {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int start, finalHour, resultHour;
		System.out.println("Digite o horario de inicio.");
		start = keyboard.nextInt();
		System.out.println("Digite o horario final.");
		finalHour = keyboard.nextInt();
		
		if(start < finalHour) {
			resultHour = finalHour - start;
		} else {
			resultHour = 24 - start + finalHour;
		}
		
		System.out.printf("O JOGO DUROU %d HORAS", resultHour);
		keyboard.close();

	}

}
