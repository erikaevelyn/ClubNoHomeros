package ar.edu.unlam.clubnohomeros;

public class ClienteDelBar implements Comparable<ClienteDelBar>{
	private String nombre;
	private Integer edad;
	
	public ClienteDelBar(String nombre, Integer edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public String getNombre(){
		return this.nombre;
	}
	
	public Integer getEdad(){
		return this.edad;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object cliente){
		ClienteDelBar cli = (ClienteDelBar) cliente;
		
		if( this.nombre.equals(cli.getNombre())){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public int compareTo(ClienteDelBar cliente) {
		return this.nombre.compareTo(cliente.getNombre());
	}

}



