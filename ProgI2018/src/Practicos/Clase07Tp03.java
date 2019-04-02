/*Implementar un método que busque la posición de un valor
entero dado en un arreglo ordenado.*/

package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase07Tp03 {

	final static int MAX = 10;
	final static int MIN = 0;
	public static void main(String args[]) {
		int num = 0;
		int arr[]=new int[MAX];
		for (int  i=0;i<MAX;i++) {
			arr[i] = obtenerEnteros();
		}
		for (int h=0;h<MAX;h++) {
//			System.out.println(h+ " " +arr[h]);
			System.out.print(h+ ": " +arr[h]+"   ");
		}
		try {
			do {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nIngrese una posicion entre " +MIN+ " y "+(MAX-1) +". Para realizar un "
								+ "corrimiento a derecha a partir de la posición elegida");
			num = new Integer(entrada.readLine());
			} while((num<MIN)||(num>(MAX-1)));
			
			for (int i=MAX-1; i>num;i--) {
				int dato = arr[i-1];
				arr[i-1] = arr[i];
				arr[i]= dato;
//				System.out.println(dato);
				
				
			}
			for (int h=0;h<MAX;h++) {
//				System.out.println(h+ " " +arr[h]);
				System.out.print(h+ ": " +arr[h]+"   ");
			}
//			System.out.println(h+ ": " +arr[h]+"   ");
		} catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
	private static int obtenerEnteros() {
		int aux = (int)Math.round(Math.random()*100); 
		return aux;
	}

}
