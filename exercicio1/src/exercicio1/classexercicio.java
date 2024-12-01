package exercicio1;
import java.util.Scanner;

public class classexercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 Scanner  inteiro1 = new Scanner(System.in);
	 
	 int a, b, total;
	 
	 System.out.print("informe o primeiro valor: ");
	 a = inteiro1.nextInt();
	 
	 System.out.print("informe o segundo valor valor: ");
	 b = inteiro1.nextInt();
  total = a + b; 
  System.out.println("O  valor das somas é" +  total);
}
}