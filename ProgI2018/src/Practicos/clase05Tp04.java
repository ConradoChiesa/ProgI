/*Escribir un programa que mientras el usuario ingrese un número
distinto de 0, pida ingresar el nombre del usuario y lo imprima
(Esto se debe repetir mientras el usuario no ingrese un 0).*/

package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase05Tp04 {

	public static void main(String[] args) {
		int num = 1;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				do {
					System.out.println("Ingrese un número entero");
					num = new Integer(entrada.readLine());
					if (num!=0) {	
						System.out.println("ingrese nombre");
						String name = new String(entrada.readLine());
						System.out.println(name);
					}
				} while (num!=0);					
			}
			catch(Exception exc ){
				System.out.println( exc );
			}
	}

}
