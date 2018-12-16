package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase04Tp07 {

	public static void main(String[] args) {

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un número de mes:");
			System.out.println("1: Enero");
			System.out.println("2: Febrero");
			System.out.println("3: Marzo");
			System.out.println("4: Abril");
			System.out.println("5: Mayo");
			System.out.println("6: Junio");
			System.out.println("7: Julio");
			System.out.println("8: Agosto");
			System.out.println("9: Septiembre");
			System.out.println("10: Octubre");
			System.out.println("11: Noviembre");
			System.out.println("12: Diciembre");
			int mounth = new Integer(entrada.readLine());
			
			switch (mounth) {
				case 1: System.out.println("Enero tiene 31 días");
					break;
				case 2: System.out.println("Febrero tiene 28 días");
					break;
				case 3: System.out.println("Marzo tiene 31 días");
					break;
				case 4: System.out.println("Abril tiene 30 días");
					break;
				case 5: System.out.println("Mayo tiene 31 días");
					break;
				case 6: System.out.println("Junio tiene 30 días");
					break;
				case 7: System.out.println("Julio tiene 30 días");
					break;
				case 8: System.out.println("Agosto tiene 31 días");
					break;
				case 9: System.out.println("Septiembre tiene 30 días");
					break;
				case 10: System.out.println("Octubre tiene 31 días");
					break;
				case 11: System.out.println("Noviembre tiene 30 días");
					break;
				case 12: System.out.println("Diciembre tiene 31 días");
					break;
			}
			
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
	}

}
