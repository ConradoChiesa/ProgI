package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase06Tp03 {

	public static void main(String[] args) {
		int option = chose_option();
		
		float valor1 = valores();
		float valor2 = valores();
		float valor3 = valores();
		switch (option){
		case 0:
			float aux0 = valor1-valor3;
			if (aux0>0) {
				System.out.println(Math.sqrt(aux0));
					
			}else {
				System.out.println("No es un número real");
			}
			
			break;
		
		case 1: 
			float aux = (valor1+valor2+valor3);
			System.out.println(aux/3);
			break;
			
		case 2: 
			 break;
			 
		case 3: 
			 break;
		}
//			System.out.println(valor2);
//			System.out.println(valor3);

	}
	private static int chose_option() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Opción 0: Obtener raiz cuadrada de la resta entre valor1 y valor3");
		System.out.println("Opción 1: Obtener el promedio de los 3 valores");
		System.out.println("Opción 2: Obtener el resultado de la función EcuacionMat(v1,v2,v3) = raiz de (v1-v3)/v2");
		System.out.println("Opción 3: Obtener el resultado del cociente entre los 3 floats ingresados y EcuacionMat(valor1,valor1,valor2");
		int option =-1;
			while (!((option>-1)&&(option<4))) {
				try {
				System.out.println("Elija una opción");
				option = new Integer (entrada.readLine());
			} 
				catch(Exception exc ){
					System.out.println( exc );
				}

		}
		return option;
	}
	private static float valores() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		float valor = 0;
		System.out.println("Introduzca un valor");
		try {
			valor = new Float (entrada.readLine());
		}
		catch(Exception exc ){
			System.out.println( exc );
		}
		return valor;
	}
	

}
