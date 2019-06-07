/*Escribir un método que retorne el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números
ingresados por el usuario (al menos 10 números).*/

package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase06Tp01 {
	public static final int MAX = 20;
	public static void main(String[] args) {
		int mayor = -999999999, ingreso = 0;
		
		for (int i =0;i<MAX;i++) {
			ingreso = pedir_entero();
			mayor = entero_mayor(ingreso, mayor);
			
		}
			System.out.println("El número mayor es: " + mayor);
	}
	public static int pedir_entero() {
		int valor = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		boolean valid = false;
		do {
			
		try {
			System.out.println("ingrese un número");
			valor = new Integer(entrada.readLine());
			valid = true;
		}
		catch (Exception exc ){
			System.out.println("Debe ingresar un numero");
		}
		}while(!valid);
		return valor;
	}
	public static int entero_mayor (int a, int b) {
		int mayor;
		if (a>b) {
			mayor = a;
		} else {
			mayor = b;
		}
		return mayor;
		}

}
