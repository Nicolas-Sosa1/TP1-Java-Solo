package EJERCICIO1;

import java.time.LocalDate;

public class Empleado extends Persona{
	
	

	private final int legajo;
	private String puesto;
	static int contLegajo = 1000;
	
	
	
	//metodo
	public static int devuelveProximoLegajo(){
		
		return contLegajo;
	}
	
	
	
	//constructores
	public Empleado() {
		super();
		this.puesto = "Sin puesto";
		
		this.legajo = contLegajo;
		contLegajo ++;
		


	}
	
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email, String puesto) {
		
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.puesto = puesto;
		
		this.legajo = contLegajo;
		contLegajo ++;
		
		
	}
	
	//getters and setters
	
	public int getLegajo() {
		return legajo;
	}

	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	//metodo toString()
	@Override
	public String toString() {
		return super.toString() +" ES EMPLEADO, SU NUMERO DE LEGAJO ES: " + legajo + " "+ "SU PUESTO ES: "+ puesto;
	}
	

}
