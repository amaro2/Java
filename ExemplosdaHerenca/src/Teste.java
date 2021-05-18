import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("totó");
		cachorro.falar();
		cachorro.abanarRabo();
		
		System.out.println(cachorro instanceof Cachorro);
		System.out.println(cachorro instanceof Object);
		System.out.println(cachorro instanceof Animal);
		//System.out.println(cachorro instanceof Gato); não deixa compilar

		
		//Animal animal = new Cachorro();
		//animal.falar();
		
		//animal.abanarRabo(); NÃO COMPILA - HIRARQUIA
		
		//animal = new Gato();
		//animal.falar();
		
		
		Animal animal;
		
		//animal = new Animal(); // da erro pois, animal é classe abstrata
		
		// Se o número digitado for positivo ele aprenseta "AU AU", se for negativo apresenta "MIAU" 
		int escolha = scan.nextInt();
		
		if (escolha % 2 == 0) {
			animal = new Cachorro();
		} else {
			animal = new Gato();
		}
		
		System.out.println(animal instanceof Cachorro); // Comparar a instância do tipo
		animal.falar(); // acoplamento tardio: Ele liga com o destino apenas na hora da execução.
		
		// Isso que é o polimorfismo - a variavél que pode assumir várias formas
		
		//A essência do polimorfismo é que, em vez de perguntar a um objeto qual é o 
		//seu tipo e então chamar algum comportamento baseado nessa resposta, 
		//você simplesmente chama o comportamento. 
		//O objeto, dependendo do seu tipo, faz a coisa certa.
		
		FiguraGeometrica figura = new Triangulo (1,1,1);
		
		System.out.println(figura.calcularArea());
		System.out.println(figura.calcularPerimetro());
		
	}

}
