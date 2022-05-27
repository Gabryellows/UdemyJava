package udemyAulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6Condicionais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorEntrada;
		System.out.println("Digte um valor com duas casa decimais.");
		
		valorEntrada = sc.nextDouble();
		
		if((valorEntrada < 0) || (valorEntrada > 100)){
			System.out.println("Fora de intervalo");
		}else if (valorEntrada <= 25.00) {
			System.out.println("Intervalo [0, 25]");
		}else if (valorEntrada <= 50.00) {
			System.out.println("Intervalo [25, 50]");
		}else if (valorEntrada <= 75.00) {
			System.out.println("Intervalo [50, 75]");
		} else {
			System.out.println("Intervalo [75, 100]");
		}
		sc.close();


}
}