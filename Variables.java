package ejercicio1;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		
		/*char caracter = a;*/
		int numeroEntero = 12;
		float numeroDecimal = 1.5f;
		String cadena = "hola que tal";
		System.out.println("mi numero entero es : " +numeroEntero);
		System.out.println("mi numero decimal es : "+numeroDecimal);
		System.out.println("mi cadena es : "+cadena);
		
		String lecturaTeclado;
		Scanner leerTeclado = new Scanner (System.in);
		
		System.out.println("escribe una frase: ");
		lecturaTeclado = leerTeclado.nextLine();
		System.out.println("has escrito : "+lecturaTeclado);
			

	}

}
