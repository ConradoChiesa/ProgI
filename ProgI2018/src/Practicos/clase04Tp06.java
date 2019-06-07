package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase04Tp06 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, mayor = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese 1er número");		
			num1 = new Integer(entrada.readLine());
			System.out.println("ingrese 2do número");	
			num2 = new Integer(entrada.readLine());
			System.out.println("ingrese 3er número");	
			num3 = new Integer(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
			
			if (num1<num2) {
				mayor=num2;
			} else {
				mayor=num1;
			}
			if (mayor<num3) {
				mayor=num3;
			}

			System.out.println(mayor);
	}

}
