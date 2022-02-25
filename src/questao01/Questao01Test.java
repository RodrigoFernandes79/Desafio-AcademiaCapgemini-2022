package questao01;

import org.junit.Assert;
import org.junit.Test;

public class Questao01Test {

	@Test
	public void testMontaEscada() {
		String respostaEsperada =  "   * \n "
				                  + " ** \n"
				               +" ***" ;

		String escada;
		escada = Questao01.montaEscada(3);

		
		Assert.assertEquals(respostaEsperada, escada);

	}
	}


