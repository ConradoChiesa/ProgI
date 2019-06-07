package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un número");
			numero = new Integer (entrada.readLine());
		}catch (Exception exc) {
			System.out.println( exc );
		}
		switch (numero)  {
		case 0:
			System.out.println("Es cero");
			break;
		case 1: case 2:
			System.out.println("Es uno o cero");
			break;

		default: 
			if (numero > 0) {
				System.out.println("Es postivo");
			} else {
				System.out.println("Es negativo");

			}
			break;
		}

	}

}
