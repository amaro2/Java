import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite um número: ");
		
		numero = scan.nextDouble();
		System.out.println(Math.sqrt(numero));
		
		System.out.println(Math.max(2, 4));

	}

}
