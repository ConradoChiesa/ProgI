/*Escribir un programa que muestre por pantalla una cuenta
regresiva de números empezando desde un valor entero menor
que 10 (ingresado por el usuario) hasta el 0 inclusive.*/

package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase05Tp03 {

	public static void main(String[] args) {
	int valoring;
	final int maximo = 11;
	final int minimo = -1;
	
	try {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println("ingrese número menor a 11");
		valoring = new Integer(entrada.readLine());
		} while (!((valoring>minimo)&&(valoring<maximo)));
		
			for (int i=valoring;i>minimo;i--) {
				System.out.println(i);
			}
		
		}
		catch(Exception exc ){
			System.out.println( exc );
		}
	}

}
