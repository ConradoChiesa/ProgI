/* Escribir un programa que solicite el ingreso de un número N
		mayor a 50, y muestre por pantalla los números que son
		múltiplos de 2 o 3.*/
package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase05Tp05 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num;
		final int minimo = 0;
		try {
			do {
				System.out.println("Ingrese un número entero mayor a 50");
				num = new Integer(entrada.readLine());
			} while (num<=50);
			
			for (int i=num;i>minimo;i--) {
				if (i%2==0) {
					System.out.println(i + " es multiplo de 2.");
				}
				if (i%3==0) {
					System.out.println(i + " es multiplo de 3.");
				}
			}
		} catch (Exception exc ){
			System.out.println( exc );
		}
		
	}

}
