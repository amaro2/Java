
public class NumeroComplexo {
	
	private final double a; // final quer dizer que o valor da variavel não vai mudar
	private final double b; // final quer dizer que o valor da variavel não vai mudar

	//metodo construtor vazio que seta as variaveis como 0
	public NumeroComplexo() {
		super();
		this.a = 0;
		this.b = 0; 
	}
	
	//meteodo construtor que seta as variaveis
	public NumeroComplexo(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	// Não possui setter pois não é possível mudar o valor da variavel
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	
	//visualizar a formula
	@Override
	public String toString() {
		return "NumeroComplexo [" + a + " " + b + "* i]";
	}

	// haasCode e eQual 
	// ver se os dois números são iguais
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(a);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(b);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumeroComplexo other = (NumeroComplexo) obj;
		//if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a)) //padrão
		if (this.a != other.a) //simplificada
			return false;
		//if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b)) //padrão
		if (this.b != other.b) //simplificada
			return false;
		return true;
	}
	
	//retorna a soma do numero complexo com outro numero 
	public NumeroComplexo somar( NumeroComplexo numero) {
		return new NumeroComplexo ( this.a + numero.a, this.b + numero.b );
	}
	
	//retorna a subtração do numero complexo com outro numero 
	public NumeroComplexo subtrair( NumeroComplexo numero) {
		return new NumeroComplexo ( this.a - numero.a, this.b - numero.b );
	}
	

	//retorna a multiplicacao do numero complexo com outro numero 
	public NumeroComplexo multiplicar( NumeroComplexo numero) {
		return new NumeroComplexo (this.a * numero.a - this.b * numero.b, 
				this.a * numero.b - this.b * numero.a);
	}
	
	//retorna a divisao do numero complexo com outro numero 
	public NumeroComplexo dividir( NumeroComplexo numero) {
		double novoA, novoB;
		novoA = (this.a * numero.a + this.b * numero.b) / (numero.a * numero.a + numero.b * numero.b);
		novoB = (this.b * numero.a - this.a * numero.b) / (numero.a * numero.a + numero.b * numero.b);
		return new NumeroComplexo(novoA, novoB);
	}
	
	
}
