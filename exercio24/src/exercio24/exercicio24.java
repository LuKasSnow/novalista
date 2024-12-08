package exercio24;
import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {
		
		 Scanner scanner = new  Scanner (System.in);
		 
		 System.out.println(" Cálculo do Custo da Energia Elétrica ");
		 
		 System.out.print("Informe o valor do Salário Mínimo: R$");
		double salariominimo = scanner.nextDouble();
		 
		 System.out.print("Informe a quantidade gasta de quilowatts ");
		 
		 double quantidadekw = scanner.nextDouble();
		 
		double valorkw = (salariominimo / 7 ) / 100 ;
		
		double valortotal = quantidadekw * valorkw ;
		
		double  valordesconto = valortotal * 0.90 ; 
		
		System.out.printf("Valor de cada quilowatt R$ %.2f%n ", valorkw);
		
		System.out.printf("Custo da energia elétrica sem o desconto  R$ %.2f%n ", valortotal);
		 
		System.out.printf("Custo da energia elétrica com o desconto R$ %.2f%n " , valordesconto);
		
		scanner.close();
		
		

	}

}
