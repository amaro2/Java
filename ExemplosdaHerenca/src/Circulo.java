
public class Circulo extends FiguraGeometricaCirculo {

		private double raio;
		
		
		public Circulo(double raio) {
			super();
			this.raio = raio;
		}
		

		public double getRaio() {
			return raio;
		}
		

		public void setRaio(double raio) {
			this.raio = raio;
		}

		@Override
		public double calcularArea() {
			
			return Math.PI * raio * raio;
		}
		
		@Override
		public double calcularPerimetro() {
			
			return 2 * Math.PI * raio; 
		}


		@Override
		public String toString() {
			return "Circulo [raio=" + raio + ", getRaio()=" + getRaio() + ", calcularArea()=" + calcularArea()
					+ ", calcularPerimetro()=" + calcularPerimetro() + "]";
		}
		
		
		
}
