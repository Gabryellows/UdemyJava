package udemyAulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6LP {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangle, circle, trapeze, square, rectangle;
		
		System.out.println("Digite 3 valores com ponto flutuante.");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangle = (A * C) / 2;
		circle = Math.pow(C, 2) * 3.14159;
		trapeze = (A + B) * C / 2;
		square = Math.pow(B, 2);
		rectangle = (B * A);
		
		System.out.printf("TRIANGULO: %.3f%n", triangle);
		System.out.printf("CIRCULO: %.3f%n", circle);
		System.out.printf("TRAPEZIO: %.3f%n", trapeze);
		System.out.printf("QUADRADO: %.3f%n", square);
		System.out.printf("RETANGULO: %.3f%n", rectangle);
		sc.close();

	}

}
