import static java.lang.Math.*;

public class ResolvedorEquacao2grau {
	
	private double a;
	private double b;
	private double c;
	private double delta;
	
	public ResolvedorEquacao2grau(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		delta = b * b - 4 * a * c;
	}
	
	public double raiz1(){
		if (delta >= 0 ) {
			return (-b + sqrt(delta)) / (2*a);
		} else {
			return Double.NaN;
		}
	}
	
	public double raiz2() {
		if (delta >= 0 ) {
			return (-b - sqrt(delta)) / (2*a);
		} else {
			return Double.NaN;
		}
		
	}
	
	public static void main (String[] args) {
		ResolvedorEquacao2grau solver = new ResolvedorEquacao2grau(1, 1, 1);
		System.out.println(solver.raiz1());
		System.out.println(solver.raiz2());
	}
	
}
