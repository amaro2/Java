
public class TesteErro {

	public static void main(String[] args) {
		//x e y recebem o valor de 0 atraves de objeto new
			Integer y = new Integer(0);
			Integer x = new Integer(0);
			
			//if (x == y)
			if (x.equals(y))
			{
				System.out.println("igual");
			} else {
				System.out.println("diferente");
			}

	}

}

// Quando utilizado o tipo de comparação (==): resultado da diferente, 
//pois o endereço que x e y estão armanezados na memórias são diferentes.


// Quando utilizado o tipo de comparação (.equals): resultado da igual,
//pois estou comparando se o valor dentro da variável é igual.


// Quando é primitivo, ou seja, o valor armanezado na variavél, não é o um objeto, a comparação, será apenas do valor,
// ou seja, das duas formas o resultado é "IGUAL".