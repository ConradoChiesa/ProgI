/*Escribir un programa que dado un número N ingresado por el
usuario imprima la tabla de multiplicar de ese número.*/

package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase05Tp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int maximo = 11;
		final int minimo = 0;
		int multiplicando = 0;
		try {
		do {
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese número a multiplicar");
			multiplicando = new Integer(entrada.readLine());
		}while ((multiplicando>0)||(multiplicando<0));
		}
		catch(Exception exc ){
			System.out.println( exc );
		}
		
		for (int i=minimo;i<maximo;i++) {
			System.out.println(multiplicando + "x" + i + "=" + (multiplicando*i));
		}
	}

}
