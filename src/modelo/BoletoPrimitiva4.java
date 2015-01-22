package modelo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BoletoPrimitiva4 {

		private int [] combinacion;
		
		Scanner teclado = new Scanner(System.in);
		
		public BoletoPrimitiva4(int numeroApuestas, String modo){
			
			if (modo.equals("AUT")) {
				generarAutomatico(numeroApuestas);
			}
			
			else {
				generarManual(numeroApuestas);
			}
			
		}
		
		public void generarAutomatico(int na) {
			
			int[] combinacion = new int[na];
			for(int i=0; i<combinacion.length; i++)
				combinacion [i]=0;
				//System.out.println(combinacion [i]);
			Random aleatorio = new Random ();
			int contadorApuestas=0;
			while (contadorApuestas<na){
				int numeroAleatorio=aleatorio.nextInt (49)+1;
				if (!haSalido(numeroAleatorio)){
					combinacion [contadorApuestas]=numeroAleatorio;
					contadorApuestas++;
				} 
			}
			
		}
			
		public void generarManual(int na) {
			int[] combinacion = new int[na];
			
			for (int i=0; i<na; i++) {
				
				do {
				
				
				combinacion[i] = teclado.nextInt();
				
				if (combinacion[i]<1 || combinacion[i]>49) {
					System.out.println("Te quedan" + (na - i));
					System.out.println("Nœmero erroneo");
				}
				else 
					System.out.println("Te quedan " + ((na - 1) - i)  + " nœmeros");
				
			} while (combinacion[i]<1 || combinacion[i]>49);
				
				
				
		}
			
		
		}
			
			
			
			
			
			
			/*for (int i=0 ;i<numeroApuestas; i++){
				combinacion [i]=aleatorio.nextInt(49)+1;				
			}*/
			
			//System.out.println(Arrays.toString(combinacion));
		
		
		
		
		
		
		/*********************************/
		
		public boolean haSalido (int numero) {
			boolean encontrado=false;
			int i=0;
			while (i<combinacion.length&&!encontrado){
				if (combinacion [i]==numero)
					encontrado=true;
			i++;
			
		}
			return encontrado;
		}
		/*********************************/
		
		public int[] getCombinacion() {
			return combinacion;
		}

		public void setCombinacion(int[] combinacion) {
			this.combinacion = combinacion;
		}

		/*********************************/
		public void imprimirCombinacion(){
			Arrays.sort(combinacion);
			for(int i=0; i < combinacion.length; i++){
				System.out.printf(combinacion [i] + "-");
				
			}
			System.out.println("");
		}
		/*********************************/
		
		public int getAciertos(int[]combinacionGanadora){
			int aciertos = 0;
			for (int i=0; i<combinacion.length; i++) {
				for (int j=0; j<combinacionGanadora.length; j++) {
					if (combinacion[i] == combinacionGanadora[j])
						aciertos++;
				}
			}
			
			System.out.println("");
			
			return aciertos;
			
		}
		
		public int getAciertos2 (int[] combinacionGanadora) {
			int aciertos = 0;
			for (int i=0; i<combinacionGanadora.length; i++) {
				if (haSalido(combinacionGanadora[i]))
						aciertos++;
			}
			return aciertos;
		}
		/*********************************/
		
}
