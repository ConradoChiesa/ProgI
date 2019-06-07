package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase04Tp04 {

	public static void main(String[] args) {
		String le = "";
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese una letra");
			le = new String(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
			switch (le) {
			case "a": 
			case "e": 
			case "i": 
			case "o": 
			case "u": 
				System.out.println("Vocal");
				break;
			default: System.out.println("Consonante");
				break;
						
			}
			

		
		
	}

}
