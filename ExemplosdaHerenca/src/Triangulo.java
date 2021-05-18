
public class Triangulo extends FiguraGeometrica {
	

	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	private double lado1, lado2, lado3; 
	@Override
	public double calcularArea() {
		double p = (lado1 + lado2 + lado3) / 2;
		double area = Math.sqrt(p * (p-lado1) * (p-lado2) * (p-lado3));
		return area;
	}

	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}

}
