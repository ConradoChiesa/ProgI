/*Escribir un programa que solicite el ingreso de números entre 0 y
999, y muestre un mensaje de cuántos dígitos tiene el mismo.
Además, si tiene 3 dígitos debe informar qué número es. Finalice
el programa cuando se ingrese el valor 0.*/

package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase05Tp06 {

	public static void main(String[] args) {
		final int min = 0;
		final int max = 1000;
		int num= -1;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			while(num != 0) {
			System.out.println("ingrese un número entre 0 y 999. Ingrese 0 para salir.");
			num = new Integer(entrada.readLine());
				do {
					
					if ((num>min)&&(num<10)) {
						System.out.println("El número ingresado tiene 1 digito");
					} else if ((num>9)&&(num<100)) {
						System.out.println("El número ingresado tiene 2 digito");
					} else if ((num>99)&&(num<max)){
						System.out.println("El número ingresado tiene 3 digito");
					}
					} while ((num<min)&&(num>max));
				} 
		}
		catch (Exception exc ){
			System.out.println( exc );
		}
	}

}
