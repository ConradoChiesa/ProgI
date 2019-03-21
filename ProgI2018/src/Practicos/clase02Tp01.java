/*Escribir un programa que permita ingresar 5 números de a
uno por vez y que los muestre por pantalla en orden inverso*/
package Practicos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase02Tp01 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		try {
			BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese int: ");
			num1 = new Integer(number.readLine());
			System.out.println ("Ingrese int: ");
			num2 = new Integer(number.readLine());
			System.out.println ("Ingrese int: ");
			num3 = new Integer(number.readLine());
			System.out.println ("Ingrese int: ");
			num4 = new Integer(number.readLine());
			System.out.println ("Ingrese int: ");
			num5 = new Integer(number.readLine());
			System.out.println(num5);
			System.out.println(num4);
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
			
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}

	}

}
