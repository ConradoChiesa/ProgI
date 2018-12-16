package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase04Tp03 {

	public static void main(String[] args) {
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un número");		
			int day = new Integer(entrada.readLine());
			
			switch (day) {
				case 1: System.out.println("Lunes");
					break;
				case 2: System.out.println("Martes");
					break;
				case 3: System.out.println("Miercoles");
					break;
				case 4: System.out.println("Jueves");
					break;
				case 5: System.out.println("Viernes");
					break;
				case 6: System.out.println("Sábado");
					break;
				case 7: System.out.println("Domingo");
					break;
			}
			
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
		
	}

}
