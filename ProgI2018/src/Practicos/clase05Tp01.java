package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase05Tp01 {

	public static void main(String[] args) {
		final int maximo = 3;
		final int minimo =1;
		int altura = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
	
			try {
				System.out.println("ingrese un número del 1 al 3 inclusive");
			
				altura = new Integer(entrada.readLine());
		
			}
			catch (Exception exc ) {
				System.out.println( exc );
				altura = 0;
			}

		} while (!((altura >= minimo) && (altura <= maximo))); 
	
		switch (altura) {
		case 1: System.out.println("bajo");
			break;
		case 2: System.out.println("medio");
			break;
		case 3: System.out.println("alto");
			break;
	
		}
	}
}
