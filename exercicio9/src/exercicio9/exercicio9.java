package exercicio9;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero");
		
		 int num1 =  scanner.nextInt();
		 
		 System.out.print("Digite o segundo numero");
		 
		 int num2 = scanner.nextInt();
		
		int  resultado = num1 / num2;
		
		System.out.println(" O resultado de " + num1 +"/" + num2 +" é :" + resultado);
		
		 scanner.close();

	}

}
