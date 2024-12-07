package exercicio19;
import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Termo Médio de uma P. A ");
		
		System.out.print("Termo antecessor (A)  ");
		int a = scanner.nextInt();
		
		System.out.print("Termo  sucessor  (C)  ");
		
        int c = scanner.nextInt();
        
        int b = (a + c) / 2;
        
        System.out.print("Termo médio " + b );
		
   scanner.close();
	}

}
