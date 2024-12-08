package exercico23;
import java.util.Scanner;
public class exercicio23 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner (System.in);
		 
		 System.out.print(" Consumo na Viagem ");
		 
		 System.out.print("Velocidade média (km/h) ");
		 
	int v = scanner.nextInt();
		 
		 System.out.print("tempo da viagem   ");
		 
		double t = scanner.nextDouble();
		 
		
		 int km = 12 ;
		 
		double  d = v *t;
		
		double l = d / km ;
		
		System.out.println("Distância percorrida   "  + (int)+ d + " km/h");
		
		System.out.printf("Combustível gasto: %.2f L%n", l);

		
		 
		 
		 
		 
		 
	}

}
