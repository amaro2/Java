import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a dist�ncia: ");
		double distancia = scan.nextDouble();
		System.out.println("Digite volume: ");
		double volume = scan.nextDouble();
		
		System.out.println("O consumo foi:" + Consumo.calcularConsumo(distancia, volume));
		
	}

}
