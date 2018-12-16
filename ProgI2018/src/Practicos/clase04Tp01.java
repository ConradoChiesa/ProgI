package Practicos;

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;

public class clase04Tp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un número");		
			int num1 = new Integer(entrada.readLine());
			
			if (num1<0) {
				System.out.println("El número ingresado es negativo");
			} else {
				System.out.println("El número ingresado es positivo");
			}
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
		
	}

}
