package ar.edu.unlam.progbasica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTragamonedas {
	
	@Test
	
	public void TestIniciarEn1LosTambores(){
		
		Tragamonedas tragamonedas = new Tragamonedas();
		
		Integer esperado = 1;
		
		Integer valor1 = tragamonedas.Tambor1.getPosicion();
		Integer valor2 = tragamonedas.Tambor2.getPosicion();
		Integer valor3 = tragamonedas.Tambor3.getPosicion();
		
		assertEquals(esperado, valor1);
		assertEquals(esperado, valor2);
		assertEquals(esperado, valor3);
	}
	
	@Test
	public void TestPosicionDeTamboresEntre1y10() {
		
		RandoNumberGenerator posicion = new RandoNumberGenerator();
		int esperado = posicion.generate();
		assertTrue(esperado >= 1 && esperado <= 10);
	}

	@Test
	public void TestFuncionamientoDeTragamonedas() {
		
		Tragamonedas tragamonedas = new Tragamonedas();
		
		tragamonedas.activar();
		
		Integer valor1 = tragamonedas.Tambor1.getPosicion();
		Integer valor2 = tragamonedas.Tambor2.getPosicion();
		Integer valor3 = tragamonedas.Tambor3.getPosicion();
		
		assertEquals(valor1, valor2, valor3);
	}	
}
	
