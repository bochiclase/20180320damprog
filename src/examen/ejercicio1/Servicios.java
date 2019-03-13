package examen.ejercicio1;

public class Servicios {

	private String nombre;
	private String tipo;
	private int cuenta;
	
	
	public Servicios (String nombre, String tipo, int cuenta ) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.cuenta= cuenta;
	}


	public int getCuenta() {
		return cuenta;
	}


	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}


	public String getNombre() {
		return nombre;
	}


	public String getTipo() {
		return tipo;
	}
	
	
	
	
}
