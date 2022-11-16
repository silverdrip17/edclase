import java.util.Scanner;

public class Ejercicios3y4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String lineaEscaner;
		
		float temperatura;
		int edad;
		String texto;
		boolean booleano;
		
		System.out.println("Por favor introduce un texto cualquiera: ");
		lineaEscaner = scan.nextLine();
		texto = scan.nextLine();
		System.out.println("has escrito: "+texto + "\n");
		
		System.out.println("Por favor, introduce una temperatura con decimales (,): ");
		lineaEscaner = scan.nextLine();
		temperatura = Float.parseFloat(lineaEscaner);
		System.out.println("Has escrito: "+temperatura + "\n");
		
		System.out.println("Por favor, introduce tu edad: ");
		lineaEscaner = scan.nextLine();
		edad = Integer.parseInt(lineaEscaner);
		System.out.println("Has escrito: "+edad);
		
		System.out.println("Por favor, introduce un valor booleano: ");
		lineaEscaner = scan.nextLine();
		booleano = Boolean.parseBoolean(lineaEscaner);
		
		
		
			

	}

}
