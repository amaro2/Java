
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

// Quando utilizado o tipo de compara��o (==): resultado da diferente, 
//pois o endere�o que x e y est�o armanezados na mem�rias s�o diferentes.


// Quando utilizado o tipo de compara��o (.equals): resultado da igual,
//pois estou comparando se o valor dentro da vari�vel � igual.


// Quando � primitivo, ou seja, o valor armanezado na variav�l, n�o � o um objeto, a compara��o, ser� apenas do valor,
// ou seja, das duas formas o resultado � "IGUAL".