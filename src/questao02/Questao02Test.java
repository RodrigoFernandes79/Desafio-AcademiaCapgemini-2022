package questao02;

import static org.junit.Assert.*;

import org.junit.Test;

public class Questao02Test {

	@Test
	public void testValidaSenha() {
		String senha = "Ya3";

		Integer y = (6 - senha.length());
		assertEquals("Senha fraca acresente mais " + y + " caracteres", Questao02.validaSenha(senha));
	}

	@Test
	public void testLoopSenha() {
		String senha = "Ya3";
		assertEquals(false, Questao02.loopSenha(senha));
	}

}
