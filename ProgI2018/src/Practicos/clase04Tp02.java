package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase04Tp02 {

	public static void main(String[] args) {
		int num1 = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un número");		
			num1 = new Integer(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );
			num1 = 0;
		}
			
			if (num1<100) {
				System.out.println("chico");
			} else {
				System.out.println("grande");
			}
		
	}

}
