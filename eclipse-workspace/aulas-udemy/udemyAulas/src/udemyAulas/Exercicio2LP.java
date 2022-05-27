package udemyAulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2LP {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, area;
		
		pi = 3.14159;
		
		System.out.println("Digite o valor do raio:");
		raio = sc.nextDouble();
		
		area = Math.pow(raio, 2) * pi;
		
		System.out.printf("O raio escolhido foi de %.2f%nA area deste raio eh %.4f", raio, area);
		
		sc.close();
	}

}