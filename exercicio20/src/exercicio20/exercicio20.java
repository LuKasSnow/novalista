package exercicio20;
import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Termo Médio  P. G");
		
		System.out.print("Termo Antecessor  ");
		int a = scanner.nextInt();
		
		System.out.print("Termo Sucessor     ");
		
		int c = scanner.nextInt();
		
		double b = Math.sqrt(a * c);
		
		System.out.print(" Termo medio  " + (int) + b);

	}

}
