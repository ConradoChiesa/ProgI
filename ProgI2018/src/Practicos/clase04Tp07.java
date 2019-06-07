package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase04Tp07 {

	public static void main(String[] args) {
		int mounth = 0, anio = 0000;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un número de mes:\n1: Enero\n2: Febrero\n3: Marzo\n4: Abril\n5: Mayo\n6: Junio\n"
								+ "7: Julio\n8: Agosto\n9: Septiembre\n10: Octubre\n11: Noviembre\n12: Diciembre");
			mounth = new Integer(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );
			mounth = 0;
		}
			if ((mounth>0)&&(mounth<13)) {
				
			switch (mounth) {
				case 1: case 3: case 5: case 8: case 10: case 12: System.out.println("Este mes tiene 31 días");
					break;
				case 2: 
					try {
						BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("ingrese un año en formato de 4 digitos");
						anio = new Integer(entrada.readLine());
					}
					catch (Exception exc ) {
						System.out.println( exc );
					}
					if  ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
						System.out.println("Febrero tiene o tuvo 29 días");
					}else {
						System.out.println("Febrero tiene o tuvo 28 días");
						
					}
					break;
				case 4: case 6: case 7: case 9: case 11: System.out.println("Este mes tiene 30 días");
					break;
			}
			}
			

	}

}
