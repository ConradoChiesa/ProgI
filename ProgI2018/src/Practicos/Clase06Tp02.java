/*Escribir un programa que simule el lanzamiento de un dado
(1000 veces) y muestre por pantalla cuantas veces salió el valor
del dado correspondiente al número entero N ingresado por el
usuario. Considerar el valor N ingresado se corresponda a un
valor posible para un dado. Usar la sentencia Math.random()
que devuelve un valor aleatorio real entre 0 y 1.
 Ejemplo: para asignar un posible valor a la variable dado entero:
dado = (int) (6*Math.random() + 1)*/

package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase06Tp02 {

	final static int MAX = 1000;
	final static int min = 0;
	public static void main(String[] args) {
		
		int selection = pedir_numero();
		int probabilidad = tirar_dado(selection);
		System.out.println("La selección del número " + selection + " salio " + probabilidad + " veces.");
		
	}
	
	
	private static int tirar_dado(int selection) {
		int counting = 0;
		for (int i=min;i<MAX;i++) {
			int dado = 0;
			dado = (int) (6*Math.random() + 1);
			if (dado == selection) {
				counting++;
			}
		}

		return counting;
	}

	private static int pedir_numero() {
		int selection = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			do {
				System.out.println("ingrese un número entre 1 y 6");
				selection = new Integer(entrada.readLine());
				
			} while (!((selection>0)&&(selection<7)));
			System.out.println(selection);
		}
		catch (Exception exc ){
			System.out.println( exc );
		}
		return selection;
	}

}
