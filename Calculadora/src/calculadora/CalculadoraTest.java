package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	/*
	@Test
	void testCalculadora() {
		fail("Not yet implemented");
	}
	*/

	@Test
	void testSumar() {
		Calculadora calculadora = new Calculadora(20,10);
		int resultado = calculadora.sumar();
		assertEquals(30, resultado);
	}

	@Test
	void testRestar() {
		Calculadora calculadora = new Calculadora(20,10);
		int resultado = calculadora.restar();
		assertEquals(10,resultado);
		
	}

	@Test
	void testMultiplicar() {
		Calculadora calculadora = new Calculadora(20,10);
		int resultado = calculadora.multiplicar();
		assertEquals(200, resultado);
	}

	@Test
	void testDividir() {
		Calculadora calculadora = new Calculadora(20,10);
		int resultado = calculadora.dividir();
		assertEquals(2,resultado);
	}

}
