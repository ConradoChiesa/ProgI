package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase06Tp03 {

	public static void main(String[] args) {
		int option = choose_option();

		final float valor1 = valores();
		final float valor2 = valores();
		final float valor3 = valores();
		float promedio, equMat;
		switch (option) {
		case 0:
			equMat = EquacionMat(valor1, valor3);
			System.out.println("La raiz de la resta da: "+ equMat);
			break;

		case 1:
			promedio = promedio(valor1, valor2, valor3);
			System.out.println("El promedio es: "+ promedio);
			break;

		case 2:
			float resultado = EquacionMat(valor1, valor3);
			resultado = dividir(resultado, valor2);
			System.out.println("La raiz de la resta dividido el segundo valor ingresado da: "+ resultado);
			break;

		case 3:
			promedio = promedio(valor1, valor2, valor3);
		//	equMat = 
			break;
		}
//			System.out.println(valor2);
//			System.out.println(valor3);

	}

	private static float dividir(float resultado, float valor2) {
		float division = resultado/valor2;
		return division;
	}

	private static float promedio(float valor1, float valor2, float valor3) {
		float promedio = (valor1 + valor2 + valor3)/3;
		return promedio;
	}

	private static int choose_option() {
		System.out.println("Opción 0: Obtener raiz cuadrada de la resta entre valor1 y valor3");
		System.out.println("Opción 1: Obtener el promedio de los 3 valores");
		System.out.println("Opción 2: Obtener el resultado de la función EquacionMat(v1,v2,v3) = raiz de (v1-v3)/v2");
		System.out.println("Opción 3: Obtener el resultado del cociente entre los 3 floats ingresados y EquacionMat(valor1,valor1,valor2");
		int option = -1;
		while ((option < 0) || (option > 3)) {
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Elija una opción");
				option = new Integer(entrada.readLine());
			} catch (Exception exc) {
				System.out.println(exc);
			}

		}
		return option;
	}

	private static float valores() {
		float valor = 0;
			System.out.println("Introduzca un valor");
			while (valor <= 0){
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				valor = new Float(entrada.readLine());
				if (valor <= 0) {
					System.out.println("Introducir un valor mayor a 0");
				}
			} catch (Exception exc) {
				System.out.println(exc);
				valor = 0;			
			}
		}
		return valor;
	}

	private static float EquacionMat(float valor1, float valor3) {
		float equMat = valor1 - valor3;
		equMat = (float) Math.sqrt(equMat);
			return equMat;
	}
}
