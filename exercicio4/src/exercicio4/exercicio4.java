package exercicio4;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		
		System.out.print("Digite a placa do veículo (4 dígitos):");
		int numeroPlaca = scanner.nextInt();
		int ultimoDigito = numeroPlaca %10;
		System.out.println("O último dígito da placa é: " + ultimoDigito);
		 scanner.close();
	}

}
