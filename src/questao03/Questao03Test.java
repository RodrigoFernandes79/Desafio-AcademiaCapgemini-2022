package questao03;

import org.junit.Assert;
import org.junit.Test;

public class Questao03Test {

	@Test
	public void testVerificaAnagrama() {
		boolean respostaEsperada = true;
		boolean verificacao;
		verificacao = Questao03.verificaAnagrama("vo", "vo");

		Assert.assertEquals(respostaEsperada, verificacao);

	}

	@Test
	public void testVerificaQuantidadeAnagrama1() {
		int respostaEsperada = 2;
		int pares;
		pares = Questao03.verificaQuantidadeAnagrama("ovo");

		Assert.assertNotNull(pares);
		Assert.assertEquals(respostaEsperada, pares);
	}

	@Test
	public void testVerificaQuantidadeAnagrama2() {
		int respostaEsperada = 3;
		int pares;
		pares = Questao03.verificaQuantidadeAnagrama("ifailuhkqq");

		Assert.assertNotNull(pares);
		Assert.assertEquals(respostaEsperada, pares);
	}

}
