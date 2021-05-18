import java.util.Date;

public class Teste {

	
	

	public static void main(String[] args) {
		
		Alunos aluno =  new Alunos(); //cria objeto aluno
		
		aluno.setRa( 1234 );
		aluno.setNome( "Iara Amaro" );
		aluno.setDataNascimento ( new Date());
		aluno.setCurso ( "ADS" );
		
		System.out.println(aluno.getNome());
		
		System.out.println(aluno);
		
		Alunos aluno2 = new Alunos(4321,"Beltano", new Date(), "GTI");
		
		System.out.println(aluno2);
	}

}
