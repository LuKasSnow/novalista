package exercicio11;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println(" Cálculo dos Minutos ");
		
		System.out.println("Informe a Hora");
		
		int h = scanner.nextInt();
		
		

		
		System.out.println("Informe o Minuto");
		int m = scanner.nextInt();
		
		int total =( h * 60) + m ;
		
		
		
		System.out.println("Total de minutos, a partir das H:" + h +":" + m+" é:" + total +" Minutos");
		
		scanner.close();
		
		
		
		

	}

}
