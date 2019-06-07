package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase03Tp04 {
	
	// NO SE SI PUEDE USARSE else
	
	public static void main(String[] args) {
	
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un número");		
			int num1 = new Integer(entrada.readLine());
			
			
			if (num1%6==0 && num1%7==0) {
				System.out.println("El número "+num1+" es multiplo de 6 y de 7");
			} else {
				System.out.println("El número número "+num1+" no es multiplo de 6 y de 7");
			}
			if(num1>30 && num1%2==0 || num1 <= 30) {
				System.out.println("El número "+num1+" es mayor a 30 y multiplo de 2 o menor a 30");
			}   
			if (num1/5>10) {
				System.out.println("El cociente de la división es mayor a 10");
			}
//			if (num2%2==0) {
//				System.out.println("El segundo número es multiplo de 2");
//			} else {
//				System.out.println("El segundo número no es multiplo de 2");
//			}
		} 
		catch (Exception exc ) {
			System.out.println( exc );
		}
	}

}