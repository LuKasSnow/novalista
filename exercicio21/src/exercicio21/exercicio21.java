package exercicio21;
import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		
		  Scanner scanner = new  Scanner (System.in);
		  
		   System.out.println("Produto de Termos de uma P. G");
		   
		   System.out.print("Termo (a1)  ");
		   
		   int a1 = scanner.nextInt();
		   
		   
		   System.out.print("Razão (q)  ");
		   
		   int q = scanner.nextInt();
		   
		   System.out.print("Quantidade de Termos (n)  ");
		   
		   int n = scanner.nextInt();
		   
		   double P = Math.pow(a1, n) * Math.pow(q, (n * (n - 1)) / 2.0);
		   
		   System.out.print(" quantidade de termos   " + n + "   é :  " + (int) + P);
		   
		   scanner.close();


	}

}
