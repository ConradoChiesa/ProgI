/*Implementar un método que busque la posición de un valor
entero dado en un arreglo ordenado.*/

package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase07Tp03 {

	final static int MAX = 10;
	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[]) {
		int num = 0;
		int arr[]=new int[MAX];
		llenararreglo(arr);
		ordenararr(arr);
		imprimirarr(arr);
		num=pedirposicion();
		corrimientoder(arr, num);
	//	corrimientoizq(arr, num);
		imprimirarr(arr);
	}
	
	public static void ordenararr(int[] arr) {
		int temp;
		for(int	i = 1;i < MAX;i++){
			for (int j = 0 ; j < MAX-1; j++){
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	} 		
	

	public static void corrimientoder(int[] arr, int pos) {
		int indice = MAX-1;
		while (indice>=pos) {
				arr[indice]=arr[indice-1];
				indice--;
			}
		}
		
	public static void corrimientoizq(int[] arr, int pos) {
		int indice = 0;
		while (indice<pos) {
				arr[indice]=arr[indice+1];
				indice++;
			}
		}

	public static int pedirposicion() {
		int num = 0;
		while((num<1)||(num>(MAX))) {
		try {
			System.out.println("\nIngrese una posicion entre 1 y "+(MAX) +". Para realizar un "
								+ "corrimiento a derecha a partir de la posición elegida");
			num = new Integer(entrada.readLine());
		} catch (Exception exc) {
			System.out.println(exc);
			num = 0;
		} 
		}
		return num;
	}

	public static void llenararreglo(int[] arr) {
		for (int  i=0;i<MAX;i++) {
			arr[i] = obtenerEnteros();
		}		
	}
	public static int obtenerEnteros() {
		int aux = (int)Math.round(Math.random()*100); 
		return aux;
	}
	
	public static void imprimirarr(int[] arr) {
		
		for (int h=1;h<=MAX;h++) {
			System.out.print(h+ ": " +arr[h-1]+"   ");
		}
	}
}
