package ar.edu.unlam.clubnohomeros;

import org.junit.Assert;
import org.junit.Test;

public class TestClubNoHomeros {
	
	@Test
	public void queSeAbraVacio(){
		ClubNoHomeros bar = new ClubNoHomeros();
		Assert.assertTrue(bar.estado() == true);
		bar.abrirElBar();
		Assert.assertTrue(bar.estado() == false);
		Assert.assertTrue(bar.getClientes().size() == 0);
		
	}
	
	@Test
	public void queNingunClienteDupliqueNombre(){
		ClubNoHomeros barcito = new ClubNoHomeros();
		ClienteDelBar juancarlos = new ClienteDelBar("Juan Carlos", 18);
		ClienteDelBar pedro = new ClienteDelBar("Pedro", 21);
		ClienteDelBar pedro2 = new ClienteDelBar("Pedro", 19);
		barcito.ingresanClientes(juancarlos);
		barcito.ingresanClientes(pedro);
		barcito.ingresanClientes(pedro2);
		Assert.assertTrue(barcito.getClientes().size() == 2);		
	}
	
	
	@Test
	public void queSeOrdenenAlfabeticamente(){
	ClubNoHomeros barbados = new ClubNoHomeros();
	ClienteDelBar juancarlos = new ClienteDelBar("Juan Carlos", 18);
	ClienteDelBar pedro = new ClienteDelBar("Pedro", 21);
	ClienteDelBar alan = new ClienteDelBar("Alan", 19);
	barbados.ingresanClientes(juancarlos);
	barbados.ingresanClientes(pedro);
	barbados.ingresanClientes(alan);
	Assert.assertEquals(alan, barbados.getClientes().first());
	Assert.assertEquals(pedro, barbados.getClientes().last());
	}
	
	@Test
	public void queSeOrdenenPorEdad(){
		ComparoPorEdad comparador = new ComparoPorEdad();
		ClubNoHomeros bardeando = new ClubNoHomeros(comparador);
		ClienteDelBar juancarlos = new ClienteDelBar("Juan Carlos", 18);
		ClienteDelBar pedro = new ClienteDelBar("Pedro", 21);
		ClienteDelBar alan = new ClienteDelBar("Alan", 19);
		bardeando.ingresanClientes(juancarlos);
		bardeando.ingresanClientes(pedro);
		bardeando.ingresanClientes(alan);
		Assert.assertTrue(juancarlos == bardeando.getClientes().first());
		Assert.assertTrue(pedro == bardeando.getClientes().last());
		}
}
