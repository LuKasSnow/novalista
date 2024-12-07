package exercicio10;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Conversão de Temperatura");
		
		System.out.println("Informe a temperatura em Celsisus");
		double c = scanner.nextDouble();
		
		double f = ( c* 9 / 5) + 32;
		
		System.out.println("Temperatura em Fahrenheir:" + f);
		
		 scanner.close();
	}

}
