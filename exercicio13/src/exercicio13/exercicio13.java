package exercicio13;
import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Cálculo do Valor do Produto");
		
		System.out.println("Preço bruto do produto (R$):");
		
		double valorBruto = scanner.nextDouble();
		
		double valorDesconto = valorBruto * 0.09 ;
		
		 System.out.printf("Valor do desconto: R$ %.3f\n", valorDesconto);
		
		double valorcomdesconto = valorBruto - valorDesconto;
		
		System.out.printf("Preço do produto com desconto  R$ %.3f\n ", valorcomdesconto);
		
		scanner.close();
		
	}

}
