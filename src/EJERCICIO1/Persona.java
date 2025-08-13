package EJERCICIO1;

import java.time.LocalDate;

public abstract class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	LocalDate fechaNacimiento = LocalDate.now();  // Fecha del día de ejecución;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	
	//constructores
	public Persona() {
		nombre = "Sin nombre";
		dni= "Sin dni";
		apellido = "Sin apellido";
		genero = "Sin genero";
		direccion = "Sin direccion";
		telefono = "Sin telefono";
		email = "Sin email";
		
		
	}
	
	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		
	}
	
	
	
	//getters and setters
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//metodo toString()
	
	@Override
	public String toString() {
		return "ES PERSONA, SU NOMBRE ES: " + nombre + " SU APELLIDO ES: " + apellido + " SU DNI ES: " + dni + " SU FECHA DE NACIMIENTO ES: " + fechaNacimiento + " SU GÉNERO ES: " + genero + " SU DIRECCIÓN ES: " + direccion + " SU TELÉFONO ES: " + telefono + " SU EMAIL ES: " + email;

	}
	
	
	
	

}
