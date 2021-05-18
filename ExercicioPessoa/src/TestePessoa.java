import java.util.Date;

public class TestePessoa {

	public static void main(String[] args) {
		
		
		System.out.println("Exibindo Pessoas: ");
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setCpf("434.273.778-73");
		pessoa.setEndereco("Rua Guarapiranga 227");
		pessoa.setNome("Iara de Lima Amaro");
		pessoa.setDataNasc(new Date());
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getCpf());
		System.out.println(pessoa.getDataNasc());
		
		System.out.println("Exibindo Funcionarios: ");
		
		Funcionarios funcionario = new Funcionarios();
		
		funcionario.setRe(13423);
		funcionario.setSalario(12000);
		funcionario.setCargo("Professor POO");
		
		System.out.println(funcionario.getRe());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getCargo());
		
		System.out.println("Exibindo Alunos: ");
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Análise e Desenvolvimento de Sistemas");
		aluno.setRa(013123);
		
		System.out.println(aluno.getCurso());
		System.out.println(aluno.getRa());
		
	}

}
