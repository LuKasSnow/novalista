package exercicio7;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner (System.in);
		 System.out.print("Digite a placa do veículo (4 dígitos):");
		 int numeroPlaca =scanner.nextInt();
		 int primeiroNumero = numeroPlaca / 1000 ;
		 System.out.print("O primeiro digito da plada e " + primeiroNumero);
		 
		
	}

}