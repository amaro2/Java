
public class NumeroRacional {
	private final int a;
	private final int b;
	
	public NumeroRacional() {
		super();
		
		this.a = 0;
		this.b = 1;
	}

	public NumeroRacional(Integer a, Integer b) {
		super();
		this.a = a;
		if (b > 0) {
			this.b = b;
		} else {
			System.out.println("denominador inválido, mudado para 1");
			this.b = 1;
		};
	}

	public Integer getA() {
		return a;
	}


	public Integer getB() {
		return b;
	}


	@Override
	public String toString() {
		return "NumeroRacional [" + a + "/" + b + "]";
	}
	
	
	
	

	//retorna a soma do numero racional com outro numero 
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
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
		NumeroRacional other = (NumeroRacional) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

		public NumeroRacional somar( NumeroRacional numero) {
			int novoA = (this.a * numero.b + numero.a * this.b);
			int novoB = (this.b * numero.b);
			return new NumeroRacional(novoA, novoB);
			
	}

		public NumeroRacional subtrair( NumeroRacional numero) {
			int novoA = (this.a * numero.b - numero.a * this.b);
			int novoB = (this.b * numero.b);
			return new NumeroRacional(novoA, novoB);
			
	}
		
		public NumeroRacional multiplicar( NumeroRacional numero) {
			int novoA = (this.a * numero.a);
			int novoB = (this.b * numero.b);
			return new NumeroRacional(novoA, novoB);
			
	}
		
		public NumeroRacional dividir( NumeroRacional numero) {
			int novoA = (this.a * numero.b);
			int novoB = (this.b * numero.a);
			return new NumeroRacional(novoA, novoB);
			
	}

	
}
