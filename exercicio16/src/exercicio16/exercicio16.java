package exercicio16;
import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Determinação de Termo (P. A.) ");
		
		System.out.print("Informe o termo a1: ");
		
		int a1 = scanner.nextInt();
		
		System.out.print("Informe o índice n ");
		
		int n = scanner.nextInt();
		
		System.out.print("Informe a razão  r: ");
		
		int r = scanner.nextInt();
		
		double a_n = a1 + (n-1) * r;
		
		System.out.print("Termo a " + n + ":" + (int) + a_n);

	}

}
