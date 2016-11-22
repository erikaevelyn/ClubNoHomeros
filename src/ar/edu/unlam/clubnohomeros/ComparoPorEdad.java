package ar.edu.unlam.clubnohomeros;

import java.util.Comparator;

public class ComparoPorEdad implements Comparator<ClienteDelBar> {
	
	public ComparoPorEdad(){
		
	}
	
	@Override
	public int compare(ClienteDelBar cliente1, ClienteDelBar cliente2){
		return cliente1.getEdad() - cliente2.getEdad();
	}

}
