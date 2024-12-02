package exercicio2;
import java.util.Scanner;


public class exercicio2 {
	             
	public static void main(String[] args) {

	System.out.println("Sucessor e Antecessor de um Número");
	
	Scanner entradaUsuario = new Scanner(System.in);
	System.out.print("Digite um número inteiro: ");
    int numero = entradaUsuario.nextInt();
    int antecessor = numero - 1;
    int sucessor = numero + 1;
    System.out.println("O antecessor do número é: " + antecessor);
    System.out.println("O sucessor do número é: " + sucessor);
    
    entradaUsuario.close();
}
}