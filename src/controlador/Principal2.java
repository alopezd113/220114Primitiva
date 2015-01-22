package controlador;

import modelo.BoletoPrimitiva4;
import modelo.BoletoPrimitiva4;

import java.util.Scanner;

public class Principal2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuantas apuestas: ");
		int numApuestas = teclado.nextInt();
		
		System.out.println("AUT/MAN ");
		String modo = teclado.next();
		
		BoletoPrimitiva4 miboleto = new BoletoPrimitiva4(numApuestas, modo);
		

	}//falta corregir AUT, corregir los nœmeros repetidos en el modo manual

}
