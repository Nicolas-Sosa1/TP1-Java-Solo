package EJERCICIO1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		
		Empleado empleado1 = new Empleado(); // vacío
		Empleado empleado2 = new Empleado(); // vacío
		Empleado empleado3 = new Empleado("34567890", "Carlos", "Martínez", LocalDate.of(1992, 3, 15), "Masculino", "San Martín 500", "555-9012", "carlos@mail.com", "Supervisor");
		Empleado empleado4 = new Empleado("45678901", "Lucía", "Fernández", LocalDate.of(1988, 11, 5), "Femenino", "Mitre 250", "555-3456", "lucia@mail.com", "Recepcionista");
		Empleado empleado5 = new Empleado("56789012", "Miguel", "Gómez", LocalDate.of(1995, 1, 25), "Masculino", "Belgrano 100", "555-7890", "miguel@mail.com", "Encargado");

		
		
		Empleado [] empleados = new Empleado[5];
		empleados[0]= empleado1;
		empleados[1]= empleado2;
		empleados[2]= empleado3;
		empleados[3]= empleado4;
		empleados[4]= empleado5;
		
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
		}
		
		System.out.println(Empleado.devuelveProximoLegajo());
		
		
		Empleado empleado6 = new Empleado();
		
		System.out.println(empleado6.toString());
		
		Empleado empleado7 = new Empleado();
		
		System.out.println(empleado7.toString());
		
		Empleado empleado8 = new Empleado("34567890", "Carlos", "Martínez", LocalDate.of(1992, 3, 15), "Masculino", "San Martín 500", "555-9012", "carlos@mail.com", "Supervisor");

		System.out.println(empleado8.toString());
		
		System.out.println(Empleado.devuelveProximoLegajo());

		Empleado empleado9 = new Empleado("45678901", "Lucía", "Fernández", LocalDate.of(1988, 11, 5), "Femenino", "Mitre 250", "555-3456", "lucia@mail.com", "Recepcionista");
		
		System.out.println(empleado9.toString());
		
		Empleado empleado10 = new Empleado("56789012", "Miguel", "Gómez", LocalDate.of(1995, 1, 25), "Masculino", "Belgrano 100", "555-7890", "miguel@mail.com", "Encargado");

		System.out.println(empleado10.toString());
		
		System.out.println(Empleado.devuelveProximoLegajo());
		
	}

}
