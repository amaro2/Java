import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("tot�");
		cachorro.falar();
		cachorro.abanarRabo();
		
		System.out.println(cachorro instanceof Cachorro);
		System.out.println(cachorro instanceof Object);
		System.out.println(cachorro instanceof Animal);
		//System.out.println(cachorro instanceof Gato); n�o deixa compilar

		
		//Animal animal = new Cachorro();
		//animal.falar();
		
		//animal.abanarRabo(); N�O COMPILA - HIRARQUIA
		
		//animal = new Gato();
		//animal.falar();
		
		
		Animal animal;
		
		//animal = new Animal(); // da erro pois, animal � classe abstrata
		
		// Se o n�mero digitado for positivo ele aprenseta "AU AU", se for negativo apresenta "MIAU" 
		int escolha = scan.nextInt();
		
		if (escolha % 2 == 0) {
			animal = new Cachorro();
		} else {
			animal = new Gato();
		}
		
		System.out.println(animal instanceof Cachorro); // Comparar a inst�ncia do tipo
		animal.falar(); // acoplamento tardio: Ele liga com o destino apenas na hora da execu��o.
		
		// Isso que � o polimorfismo - a variav�l que pode assumir v�rias formas
		
		//A ess�ncia do polimorfismo � que, em vez de perguntar a um objeto qual � o 
		//seu tipo e ent�o chamar algum comportamento baseado nessa resposta, 
		//voc� simplesmente chama o comportamento. 
		//O objeto, dependendo do seu tipo, faz a coisa certa.
		
		FiguraGeometrica figura = new Triangulo (1,1,1);
		
		System.out.println(figura.calcularArea());
		System.out.println(figura.calcularPerimetro());
		
	}

}
