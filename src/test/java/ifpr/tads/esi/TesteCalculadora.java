package ifpr.tads.esi;

import org.junit.Assert;
import org.junit.Test;

public class TesteCalculadora {
	
	@Test
	public void testeSoma() {
		Assert.assertEquals(4, Calculadora.soma(2., 3.), 0.001);
	}
	
	@Test
	public void testeSubtracao() {
		Assert.assertEquals(1, Calculadora.subtracao(3., 2.), 0.001);
	}
	
	@Test
	public void testeMultiplicacao() {
		Assert.assertEquals(10., Calculadora.multiplicacao(2., 5.), 0.001);
	}
	
	@Test
	public void testeDivisao() {
		Assert.assertEquals(2., Calculadora.divisao(10., 5.), 0.001);
	}

}
