package Practicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase03Tp03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un número");		
			int num1 = new Integer(entrada.readLine());
			System.out.println("ingrese otro número");		
			int num2= new Integer(entrada.readLine());
			
			if(num1>num2) {
				System.out.println("El primer número es mayor que el segundo");
			} else {
				System.out.println("El primer número es mmenor que el segundo");
			}
			
			if (num1%2==0) {
				System.out.println("El primer número es multiplo de 2");
			} else {
				System.out.println("El primer número no es multiplo de 2");
			}
			if (num2%2==0) {
				System.out.println("El segundo número es multiplo de 2");
			} else {
				System.out.println("El segundo número no es multiplo de 2");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
