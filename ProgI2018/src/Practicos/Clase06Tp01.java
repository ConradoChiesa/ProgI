/*Escribir un método que retorne el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números
ingresados por el usuario (al menos 10 números).*/

package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Clase06Tp01 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("ingrese un número");
			int a = new Integer(entrada.readLine());
			System.out.println("ingrese un número");
			int b = new Integer(entrada.readLine());
			int c = mayor(a,b);
			System.out.println("El número mayor es: " + c);
		}
			catch (Exception exc ){
				System.out.println( exc );
			}
	}
	public static int mayor (int a, int b) {
		int aux;
		if (a>b) {
			aux = a;
		} else {
			aux = b;
		}
		return aux;
		}

}
