package ar.edu.unlam.progbasica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTragamonedas {
	
	@Test
	
	public void TestIniciarEn1(){
		
		Tragamonedas tragamonedas = new Tragamonedas();
		
		Integer esperado = 1;
		
		Integer valor1 = tragamonedas.Tambor1.getposicion();
		Integer valor2 = tragamonedas.Tambor2.getposicion();
		Integer valor3 = tragamonedas.Tambor3.getposicion();
		
		assertEquals(esperado, valor1);
		assertEquals(esperado, valor2);
		assertEquals(esperado, valor3);
	}

	@Test
	public void TestTragamonedas() {
		
		Tragamonedas tragamonedas = new Tragamonedas();
		
		tragamonedas.activar();
		
		System.out.println(tragamonedas.Tambor1.getposicion() + " | " + tragamonedas.Tambor2.getposicion() + " | " + tragamonedas.Tambor3.getposicion());
		
		if(tragamonedas.entregarPremio() == true){
			System.out.println("Felicidades,ganaste el premio!!.");
		} else {
			
			System.out.println("Vuelve a intentarlo! Buena suerte.");
			
		}
	}
	
	
}