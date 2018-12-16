package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase04Tp05 {

	public static void main(String[] args) {

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese 1er número");		
			int num1 = new Integer(entrada.readLine());
			System.out.println("ingrese 2do número");	
			int num2 = new Integer(entrada.readLine());
			System.out.println("ingrese 3er número");	
			int num3 = new Integer(entrada.readLine());
			
			if (num1<num2 && num2<num3) {
				System.out.println("Creciente");
			} else if (num1>num2 && num2>num3) {
				System.out.println("Decreciente");
			}else {
				System.out.println("Error");
			}
			
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
		
	}

}
