package examen.ejercicio1;

import java.util.*;

public class contratista extends Obreros {
	
	private List <String> lista = new ArrayList <String>();
	
	public contratista (String nombre, String apellido, int fecha, int cuenta, String empresa) {
		super (nombre, apellido, fecha);
		lista.add(empresa);
		
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}
	
	
	

}
