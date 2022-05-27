package udemyAulas;

import java.util.Scanner;

public class Exercicio3LP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, Diferenca;
		
		System.out.println("Digite quatro valores inteiro e mostre a diferença do produto \r\n"
				+ "de A e B pelo produto de C e D");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Diferenca = (A*B - C * D);
		
		System.out.println("Diferenca = " + Diferenca);
		
		sc.close();

	}

}
