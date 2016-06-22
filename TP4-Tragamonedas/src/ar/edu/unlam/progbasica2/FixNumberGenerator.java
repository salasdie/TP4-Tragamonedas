package ar.edu.unlam.progbasica2;

public class FixNumberGenerator implements NumberGenerator{
	
	private Integer valor;
	
	public FixNumberGenerator (Integer number){
		
		if(number > 0 && number < 11){
			
			valor = number;
			}
		}
	
	@Override
	
	public Integer generate(){
		return valor;
	}
	
}


