
public class Funcionarios extends Pessoa {

	private Number re;
	private String cargo;
	private Number salario;

	
	
	public Funcionarios() {
		super();
	}


	public Funcionarios(Number re, String cargo, Number salario) {
		super();
		this.re = re;
		this.cargo = cargo;
		this.salario = salario;
	}


	public Number getRe() {
		return re;
	}


	public void setRe(Number re) {
		this.re = re;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Number getSalario() {
		return salario;
	}


	public void setSalario(Number salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Funcionarios [re=" + re + ", cargo=" + cargo + ", salario=" + salario + "]";
	}
	
	
}
