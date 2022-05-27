package udemyAulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5LP {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int productA, quantityA, productB, quantityB;
		double priceA, priceB, total;
		
		System.out.println("Digite as informacoes sobre o produto A.");
		productA = sc.nextInt();
		quantityA = sc.nextInt();
		priceA = sc.nextDouble();
		
		System.out.println("Digite as informacoes sobre o produto B");
		productB = sc.nextInt();
		quantityB = sc.nextInt();
		priceB = sc.nextDouble();
		
		total = (priceA * quantityA) + (priceB * quantityB);
		System.out.printf("Valor a pagar: R$ %.2f" , total);
		
		sc.close();

	}

}
