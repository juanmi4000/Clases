package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase que nos permite leer datos por teclado asegurándose
 * que el tipo de dato introducido es compatible con el esperado.
 * 
 * @author Juan Manuel
 */
public class Entrada {
	
	/**
	 * Constructor privado para evitar que java genere el suyo
	 * por defecto y así evitar que se puedan instanciar objetos
	 */
	private Entrada () {
		// No se permiten instanciar objetos de esta clase
	}
	
	/**
	 * Método estático que lee una cadena por teclado
	 * @return la cadena leída
	 */
	public static String introducirCadena() {
		String valor = "";
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
		
		try {
			valor = teclado.readLine();
		} catch (IOException e) {
			System.out.print("ERROR de entrada/salida. Inténtelo de nuevo: ");
		}
		
		return valor;
	}
	
	/**
	 * Método estático que lee un entero por teclado y se asegura
	 * que el valor introducido es compatible con un entero
	 * @return el entero leído
	 */
	public static int introducirEntero() {
		int entero = 0;
		boolean introducido = false;
		do {
			try {
				entero = Integer.parseInt(introducirCadena());
				introducido = true;
			} catch (NumberFormatException e) {
				System.out.print("ERROR: esperaba un entero (int). Inténtelo de nuevo: ");
			}
		} while (!introducido);
		return entero;
		
	}
	
	/**
	 * Método estático que lee un entero largo (long) por teclado y se asegura
	 * que el valor introducido es compatible con un entero largo
	 * @return el entero largo leído
	 */
	public static long introducirEnteroGrande() {
		long largo = 0;
		boolean introducido = false;
		do {
			try {
				largo = Long.parseLong(introducirCadena());
				introducido = true;
			} catch (NumberFormatException e) {
				System.out.print("ERROR: esperaba un entero largo (long). Inténtelo de nuevo: ");
			}
		} while (!introducido);
		return largo;
	}
	
	/**
	 * Método estático que lee un real (float) por teclado y se asegura
	 * que el valor introducido es compatible con un real
	 * @return el real leído
	 */
	public static float introducirReal() {
		float real = 0.0f;
		boolean introducido = false;
		do {
			try {
				real = Long.parseLong(introducirCadena());
				introducido = true;
			} catch (NumberFormatException e) {
				System.out.print("ERROR: esperaba un real (float). Inténtelo de nuevo: ");
			}
		} while (!introducido);
		return real;
	}
	
	/**
	 * Método estático que lee un real de doble precisión (double) 
	 * por teclado y se asegura que el valor introducido es compatible con un real de doble precisión
	 * @return el real de doble precisión leído
	 */
	public static double introducirRealLargo() {
		double realLargo = 0.0;
		boolean introducido = false;
		do {
			try {
				realLargo = Long.parseLong(introducirCadena());
				introducido = true;
			} catch (NumberFormatException e) {
				System.out.print("ERROR: esperaba un real largo (double). Inténtelo de nuevo: ");
			}
		} while (!introducido);
		return realLargo;
	}
	
	/**
	 * Método estático que lee un caracter por teclado y se asegura
	 * que el valor introducido es compatible con un caracter
	 * @return el caracter leído
	 */
	public static char introducirCaracter() {
		String caracter;
		boolean introducido = false;
		do {
			caracter = introducirCadena();
			if (caracter.length() == 1) {
				introducido = true;
			} else {
				System.out.print("ERROR: esperaba un carácter (char). Inténtelo de nuevo: ");
			}
		} while (!introducido);
		return caracter.charAt(0);
	}
	
	
}
