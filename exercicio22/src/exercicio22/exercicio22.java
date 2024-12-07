package exercicio22;
import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner (System.in);
		 
		 System.out.println(" Cálculo do Salário Líquido ");
		 
		 System.out.printf(" Valor da Hora-aula ");
		   
		 double valorHora = scanner.nextDouble();
		 
		 System.out.print("Número de aulas ministradas ");
		 
		 int  valorAula = scanner.nextInt();
		 
		 System.out.print("Desconto do INSS ");
		 
		 int  potencialInss = scanner.nextInt();
		 
		double  salarioBruto = valorHora * valorAula ;
		
		double descontoInss = salarioBruto * (potencialInss/ 100.0 );
		
		double salarioliquido = salarioBruto - descontoInss ;
		
		System.out.printf(" Salário líguido R$ %.2f\n ", salarioliquido);
		
	scanner.close();


		
	}

}
