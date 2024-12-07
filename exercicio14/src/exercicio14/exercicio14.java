package exercicio14;
import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner (System.in);
		 
		 System.out.println("Determinação de Termo (P. G.)");
		 
		 System.out.print("Índice do termo desejado (n) ");
		 
		 int n = scanner.nextInt();
		 
		 System.out.print("Informe o índice k ");
		  
		 int k = scanner.nextInt();
		 
		 System.out.print("Informe o termo ak: ");
		 
		 int ak = scanner.nextInt();
		 
		 System.out.print("Informe a razão  q: ");
		 int q = scanner.nextInt();
		 
		 double a_n = ak * Math.pow(q, (n - k));
		  
		 System.out.println("Termo  " + n + ":" + (int )+ a_n );
		 
		  scanner.close();

	}

}
