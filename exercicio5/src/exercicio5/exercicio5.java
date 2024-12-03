package exercicio5;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		
		   Scanner scanner = new Scanner (System.in);
		   
		   System.out.print("Digite a placa do veículo (4 dígitos):");
		   int numeroPlaca = scanner.nextInt();
		  int terceiroDigito = (numeroPlaca / 10) % 10;
		  
		 
		  System.out.print( "O terceiro digito da plada e " + terceiroDigito);
	
	
	
	}

}
