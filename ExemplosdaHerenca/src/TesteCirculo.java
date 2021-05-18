
public class TesteCirculo {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(100);

		System.out.println("O cálculo da área é: " + circulo.calcularArea());
		
		System.out.println("O cálculo do perímetro é: " + circulo.calcularPerimetro());
		
		
		int x = 3;
		int y = 10;
		System.out.println(y % x);
		
	}

}
