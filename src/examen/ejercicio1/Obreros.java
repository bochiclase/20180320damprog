package examen.ejercicio1;

public class Obreros {
	
	private String nombre;
	private String apellido;
	private int fecha;
	private int cuenta;
	
	public Obreros(String nombre, String apellido, int cuenta) {
	this.nombre= nombre;
	this.apellido=apellido;
	this.fecha= 2019;
	this.cuenta=cuenta;
	
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

	public String getApellido() {
		return apellido;
	}

	public int getFecha() {
		return fecha;
	}

	
	
	
	
	
}
