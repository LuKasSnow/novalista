package exercicio18;
import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Soma Termos de uma P. A. ");
		
		System.out.print("Informe o termo a1    ");
		int a1 = scanner.nextInt();
		
		System.out.print("Quantidade de termos n:    ");
		
		int n = scanner.nextInt();
		
		System.out.print("Informe o termo an:  ");
		
		int an = scanner.nextInt();
		
		double sn =  (a1 + an) * (n / 2.0);
		
		System.out.print("Soma dos 100 primeiros termos " + (int) + sn);

		scanner.close();
		
	}

}
