package ar.edu.unlam.progbasica2;

public class Tambor {

		private Integer posicion;
		
		public Tambor(NumberGenerator generator){
			
			posicion = generator.generate();
		}
		
		public Integer getPosicion(){
			
			return posicion;
		}
		
		public void girar(){
			
			RandoNumberGenerator numero = new RandoNumberGenerator();
			
			posicion = numero.generate();
		}
}

