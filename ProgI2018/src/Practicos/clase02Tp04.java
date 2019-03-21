/*Escribir un programa que solicite Nombre, edad, altura,
ocupación, y los imprima por pantalla.*/
package Practicos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase02Tp04 {

	public static void main(String[] args) {
		String name, ocupation;
		int age, altura;
				
		try {
			BufferedReader ingreso = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese su nombre: ");
			name = new String(ingreso.readLine());
			System.out.println ("Ingrese su edad: ");
			age = new Integer(ingreso.readLine());
			System.out.println ("Ingrese su altura en centimetros: ");
			altura = new Integer(ingreso.readLine());
			System.out.println ("Ingrese su ocupación: ");
			ocupation = new String(ingreso.readLine());
			System.out.println ("Su nombre es "+name+", su edad es "+age+" años, \nusted mide "+altura+" centimetros y \nsu ocupación es "+ocupation);
			
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}

	}

}