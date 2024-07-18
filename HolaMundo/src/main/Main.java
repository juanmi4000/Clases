package main;

public class Main {

	public static void main(String[] args) {
		
		// 17/07/2024
		// Muestro hola mundo
		/* Otro comentario */
		/*System.out.println("Hola mundo"); // Salto de línea
		// System.out.print("Hola mundo"); // Sin salto de línea
		
		// 2º ejemplo
		int miEdad = 34; // int
		System.out.print("Mi edad es: ");
		System.out.println(miEdad);
		
		// int, float, double (numericos) -> variable siempre debe tener la primera letra en minus y las siguientes en mayúscula
		//int miEdad = 34; // int
		float miFloat = 12.01f;
		double miDouble = 12.04; // declaramos y luego se inicializa la variable
		// System.out.println(miEdad);
		
		// booleano (true, false)
		boolean miTrue = true;
		boolean miFalse = false;
		boolean tengoMovil = true;
		System.out.println(miTrue);
		
		// char 
		char miChar = 'C';
		System.out.println(miChar);
		
		// String -> "hola mundo"
		String miString = "Una cadena";
		System.out.println(miString);
		
		// Cambiar valor variables
		int eurosTotales = 25;
		System.out.println(eurosTotales);
		eurosTotales = 28;
		System.out.println(eurosTotales);*/
		
		// Ejercicio 1: // declara tres variables con el valor que tu elijas y muestrala por pantalla
		/*int miEdad = 34;
        System.out.println(miEdad);

        float misAños = 36;
        System.out.println(misAños);

        boolean miTrue = true;
        System.out.println(miTrue);

        String miString = "Mi cadena";
        System.out.println(miString);
		*/
		
		// Ejercicio 2: debes declarar e inicializar las siguientes variables (ponle el valor que más rabia te de): cantidadPeras, heComidoHoy (esta es booleano) y miNombre. Muestra cada variable por pantalla pero la variable de mi nombre debe mostrarse de la sisguiente forma: Mi nombre es (aquí debe aparecer el valor de la variable) 
		
		
		// poner fecha
		// operadores aritméticos: +, -, *, /, %
		/* int num1 = 4;
		int num2 = 5;
		
		// suma
		int suma;
		suma = num1 + num2;
		System.out.println("Suma: " + suma);
		
		// resta
		int resta;
		resta = num1 - num2;
		System.out.println("Resta: " + resta);
		
		// multiplicación
		int multiplicacion;
		multiplicacion = num1 * num2;
		System.out.println("Multiplicación: " + multiplicacion);
		
		// división
		float division;
		division = (float) num2 / (float) num1;
		System.out.println("División: " + division);
		
		// resto
		int resto;
		resto = num2 % num1;
		System.out.println("Resto de la división: " + resto);*/
		
		// operadores lógicos (true, false): and (&, && (umpersand)), or (|, ||), <, <=, >, >=
		int num1 = 4;
		int num2 = 5;
		boolean heComido = true;
		boolean heDormido = false;
		System.out.println(heComido && heDormido); // false, para que de true ambas variables deben ser verdaderas
		System.out.println(heComido || heDormido); // true, para que de true puede ser con solo una variable que sea verdadera
		// <
		System.out.println(num1 < num2); // true
		
		// <=
		System.out.println(num1 <= num2); // true
		
		// >
		System.out.println(num1 > num2); // true
				
		// >=
		System.out.println(num1 >= num2); // true
		
		// operadores lógicos: != (diferente), == (igual)
		System.out.println(num1 != num2); // true
		System.out.println(num1 == num2); // false
		
		// condicionales: comprobamos y se ejecuta un bloque u otro
		// IF y if/else
		if(num1 > 0) { // (aqui me llamo expresión), true -> entra en el bloque, false -> se olvida y no se ejecuta 
			System.out.println("Num1 es mayor que 0");
		}
		
		if(num1 < 0) {
			System.out.println("Num1 es menor que 0");
		} else {
			System.out.println("Ejecuto porque la expresión es false");
		}
		
		// anidar if
		if(num1 < 0) {
			System.out.println("Num1 es menor que 0");
		} else if(num1 == 0) {
			System.out.println("Num1 es igual a 0");
		} else {
			System.out.println("Num1 es mayor que 0");
		}
		
		
		
		
		
		
	}

}
