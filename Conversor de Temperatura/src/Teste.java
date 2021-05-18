import java.util.Scanner;

//teste
public class Teste {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Conversor conversor = new Conversor(); // criando uma instância de um conversor
		//inativei porque no Conversor.java utilizei o static para chamar diretamente
		
		System.out.println("Digite a temperatura em graus F: ");
		
		double tempF = scan.nextDouble();
		
		System.out.println("A temperatura em C é: " + Conversor.converterDeFparaC(tempF));
		
		System.out.println("Digite a temperatura em graus C: ");
		
		double tempC = scan.nextDouble();
		
		System.out.println("A temperatura em F é: " + Conversor.converterDeCparaF(tempC));
		
	}

}
