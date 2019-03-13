package examen.ejercicio1;

import java.util.Scanner;

public class comun {

	public static void main(String[] args) {
		
		
		System.out.println("software de Pagos");
		System.out.print("Que desea hacer: Pulse 1 para Ingresar nomina");
		System.out.print("Que desea hacer: Pulse 2 para Pagar Servicio");
		Scanner r = new Scanner(System.in);
		int opcion = r.nextInt();
			if (opcion == 1) {
			System.out.println("Escribe el nombre del trabajador");
			String nombre = r.nextLine();
			System.out.println("Escribe el apellido del trabajador");
			String apellido = r.nextLine();
			System.out.println("Escribe el numero de cuenta");
			int cuenta = r.nextInt();
			System.out.println("Escribe el dinero a ingresar");
			int saldo = r.nextInt();
			Obreros obrero = new Obreros (nombre, apellido,cuenta);
			System.out.println("Se ha ingrsado la nomina de " + nombre + apellido + " en el numero de cuenta " + cuenta + " la cantidad de " + saldo);
			
			if (opcion == 2) {
				System.out.println("Escribe el nombre del servicio");
				String snombre = r.nextLine();
				System.out.println("Escribe el tipo de servicio");
				String servicio = r.nextLine();
				System.out.println("Escribe el numero de cuenta");
				int scuenta = r.nextInt();
				System.out.println("Escribe la cantidad a pagar");
				int precio = r.nextInt();
				Servicios servi = new Servicios(snombre,servicio,scuenta);
				System.out.println("El pago se ha realizado el pago de " + snombre + " del tipo" + servicio + " la cantidad de " + precio);
			}
			
		}

	}

}
