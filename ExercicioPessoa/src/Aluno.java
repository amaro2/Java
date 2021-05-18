
public class Aluno extends Pessoa {

	private Number ra;
	private String curso;
	
	public Aluno() {
		super();
	}

	public Aluno(Number ra, String curso) {
		super();
		this.ra = ra;
		this.curso = curso;
	}

	public Number getRa() {
		return ra;
	}

	public void setRa(Number ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", curso=" + curso + "]";
	}
	
	
}
