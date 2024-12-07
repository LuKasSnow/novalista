package exercicio6;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a placa do veículo (4 dígitos):");
		 int numeroPlaca= scanner.nextInt();
		 int SegundoDigito = (numeroPlaca / 100) % 10; 
		 
		 System.out.print("O segundo digito da plada e " + SegundoDigito);

	}

}
