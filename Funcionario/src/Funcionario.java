
public class Funcionario {
	
	private int re;
	private String nome;
	private double salario;
	private String cargo;
	
	
	
	
	
	public Funcionario() {
		System.out.println("chamou o primeiro construtor");
	}
	
	
	
	public Funcionario(int re, String nome, double salario, String cargo) {
		super();
		System.out.println("chamou o segundo construtor");
		this.re = re;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}




	public int getRe() {
		return re;
	}
	public void setRe(int re) {
		this.re = re;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void aumentarSalario( double porcentagem ) {
		this.salario *= 1+(porcentagem/100);
	}
	
	@Override
	public String toString() {
		return "Funcionario [re=" + re + ", nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + "]";
	}
	
	
}
