
public class Teste {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(); //cria objeto aluno
		
		funcionario.setRe(123456);
		funcionario.setNome("Iara Amaro");
		funcionario.setSalario(12.000);
		funcionario.setCargo("Dev");
		
		System.out.println(funcionario.getNome());
		
		System.out.println(funcionario);
		
		Funcionario funcionario2 = new Funcionario(123323, "João da Silva", 13.000, "DEV");
		
		System.out.println(funcionario2);

	}

}
