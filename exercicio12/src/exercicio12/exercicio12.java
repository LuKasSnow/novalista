package exercicio12;
import java.util.Scanner;
public class exercicio12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Cálculo do Volume ");
		
		System.out.println("Altura da lata");
		
		double h = scanner.nextDouble();
		
		System.out.println("Raio da lata");
		
		double r = scanner.nextDouble();
		
		double v = 3.14159 * r * r  * h;
		
		System.out.println("volume da lata" + v);
		
		scanner.close();

	}

}
