package ar.edu.unlam.progbasica2;

public class Tragamonedas {
	
	Tambor Tambor1;
	Tambor Tambor2;
	Tambor Tambor3;
	
	public Tragamonedas(){
		
		FixNumberGenerator inicial = new FixNumberGenerator(1);
		
		Tambor1 = new Tambor(inicial);
		Tambor2 = new Tambor(inicial);
		Tambor3 = new Tambor(inicial);
	}
	
	public void activar(){
		
		Tambor1.girar();
		Tambor2.girar();
		Tambor3.girar();
	}
	
	public boolean entregarPremio(){
		
		if(Tambor1.getPosicion() == Tambor2.getPosicion() && Tambor2.getPosicion()== Tambor3.getPosicion()){
			
			return true;
		
		} else {
			
			return false;
		}
	}
}
