package exercicio17;
import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Determinação de Termo (P. A.)  ");
		
		System.out.print("Informe o índice n:  ");
		
	    int n = scanner.nextInt();
	    
	    System.out.print("Informe o índice k   ");
	    
	    int k = scanner.nextInt();
	    
	    System.out.print("Informe o termo ak:  ");
	    
	    int a_k = scanner.nextInt();
	    
	    System.out.print("Informe a razão  r:  ");
	    
	    int r = scanner.nextInt();
	    
	    double a_n = a_k + (n - k) * r;
	    
	    System.out.print(" Termo  " + n + " : " + (int) + a_n );
	

	}

}
