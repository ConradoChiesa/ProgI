/*Pedir y luego informar por consola los valores necesarios para
dibujar un triángulo.*/
package Practicos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
	public class clase02Tp03 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		try {
			BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese int: ");
			num1 = new Integer(number.readLine());
			
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}

	}

}