package udemyAulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5Condicionais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double preco;
		
		System.out.println("Digite um codigo de 1 a 5");
		codigo = sc.nextInt();
		
		if (codigo == 1) {
			preco = 4.00;
			System.out.println("Voc? escolheu Cachorro Quente tunado");
			System.out.println("Quantos voc? quer?");
			quantidade = sc.nextInt();
			System.out.printf("O preco do produto ?: R$%.2f%n" , preco * quantidade);
		} else if (codigo == 2){
			preco = 4.50;
			System.out.println("Voc? escolheu X-salada tunado");
			System.out.println("Quantos voc? quer?");
			quantidade = sc.nextInt();
			System.out.printf("O preco do produto ?: R$%.2f%n" , preco * quantidade);
		} else if (codigo == 3){
			preco = 5.00;
			System.out.println("Voc? escolheu X-bacon tunado");
			System.out.println("Quantos voc? quer?");
			quantidade = sc.nextInt();
			System.out.printf("O preco do produto ?: R$%.2f%n" , preco * quantidade);
		} else if (codigo == 4){
			preco = 2.00;
			System.out.println("Voc? escolheu Torrada simples tunado");
			System.out.println("Quantos voc? quer?");
			quantidade = sc.nextInt();
			System.out.printf("O preco do produto ?: R$%.2f%n" , preco * quantidade);
		} else if (codigo == 5){
			preco = 1.00;
			System.out.println("Voc? escolheu Refrigerante tunado");
			System.out.println("Quantos voc? quer?");
			quantidade = sc.nextInt();
			System.out.printf("O preco do produto ?: R$%.2f%n" , preco * quantidade);
		} else {
			System.out.println("Voc? escolheu um produto inexistente.");
		}
		
		sc.close();

	}

}
