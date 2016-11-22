package ar.edu.unlam.clubnohomeros;

import java.util.TreeSet;

public class ClubNoHomeros {

	private TreeSet <ClienteDelBar> clientes;
	private Boolean cerrado;
	
	public ClubNoHomeros(){
		clientes = new TreeSet<ClienteDelBar>(); 
		this.cerrado = true;
		
	}
	
	public void abrirElBar(){
		this.cerrado = false;
	}
	
	
	public boolean estado(){
		return cerrado;
	}
	
	

	
	public void ingresanClientes(ClienteDelBar cliente){
		clientes.add(cliente);
	}
	
	public ClubNoHomeros(ComparoPorEdad comparador){
		clientes = new TreeSet<ClienteDelBar>(comparador);
		this.cerrado = true;
	}
	
	public TreeSet<ClienteDelBar> getClientes(){
		return clientes;
	}
	
	
	public void cerrarElBar(){
		this.cerrado = true;
	}

}
