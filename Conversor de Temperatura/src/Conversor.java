
public class Conversor {
	
	public static double converterDeFparaC( double F ) {
		double C = (F - 32) * 5 / 9;
		return C;
	}
	
	public static double converterDeCparaF ( double C ) {
		double F = C * 9 / 5 + 32;
		return F;
	}
	
}
