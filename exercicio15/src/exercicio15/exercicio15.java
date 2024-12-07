package exercicio15;
import java.util.Scanner;

public class exercicio15 {
	
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Determinação de Termo (P. G.) ");
		
		 
		 System.out.print("Informe o termo a1 ");
		 
		 int a1 = scanner.nextInt();
		 
		 System.out.print("Informe o índice n ");
		 int n = scanner.nextInt();
		 
		 System.out.print("Informe a razão  q ");
		 
		 int q = scanner.nextInt();
		 
		 double a_n =  a1 * Math.pow(q, (n - 1));
		 
		
		 
		  System.out.println("Termo " + n +": " +(int) a_n);
		
		  scanner.close();
	} 
	
	
	
	
	
	
	

}
