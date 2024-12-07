package exercicio8;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o  valor A:");
		int a = scanner.nextInt();
		
		System.out.print("Digite o  valor B");
		int b = scanner.nextInt();
		
		System.out.println("O valor A é " + a + " o valor B é " + b );
		
		int temp = a;
		
		int tempp = b;
		
		a= tempp;
	
		b= temp;
		
		System.out.println("O valor A  agora é " + a + " o valor B é " + b );
		
		 scanner.close();
		
	
	}

}
