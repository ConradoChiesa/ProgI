package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase04Tp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un número");		
			int num1 = new Integer(entrada.readLine());
			
			if (num1<100) {
				System.out.println("chico");
			} else {
				System.out.println("grande");
			}
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
		
	}

}
