package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase04Tp04 {

	public static void main(String[] args) {

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese una letra");		
			//le == letra
			String le = new String(entrada.readLine());
			
			switch (le) {
			case "a": System.out.println("Vocal");
				break;
			case "e": System.out.println("Vocal");
				break;
			case "i": System.out.println("Vocal");
				break;
			case "o": System.out.println("Vocal");
				break;
			case "u": System.out.println("Vocal");
				break;
			default: System.out.println("Consonante");
				break;
						
			}
			
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
		
		
	}

}
