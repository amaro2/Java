
// Plain out java project - POJO

import java.util.Date;

public class Alunos {
	
	private int ra;
	private String nome;
	private Date dataNascimento;
	private String curso;
	
	//construtor default não tem void:
	public Alunos() {
		System.out.println("chamou o construtor de Aluno");
	}
	
	//contrutor pode passar parametros:
	public Alunos(int ra, String nome, Date dataNascimento, String curso) {
		super();
		System.out.println("chamou o outro construtor de Aluno");
		this.ra = ra;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.curso = curso;
	}


	public int getRa() { //getter
		return this.ra;
	}
	
	public void setRa(int ra) { //setter
		 this.ra = ra;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alunos [ra=" + ra + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", curso=" + curso + "]";
	}
	
	

}
