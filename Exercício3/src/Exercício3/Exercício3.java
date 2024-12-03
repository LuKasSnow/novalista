package Exercício3;
import java.util.Scanner;

class Exercício3 {

	public static void main(String[] args) {
		
	       Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro numero");
		  double numero1 = scanner.nextDouble();
		 
		 

		 System.out.print("Digite o segundo número real: ");
	        double numero2 = scanner.nextDouble();
	        
	        System.out.print("Digite o terceiro número real: ");
	        double numero3 = scanner.nextDouble();
	        
	        double media = (numero1 + numero2 + numero3) / 3;
	        
	        System.out.println("A média dos números é: " + media);
	        
	        scanner.close();
	        
	        
	}
	

}


