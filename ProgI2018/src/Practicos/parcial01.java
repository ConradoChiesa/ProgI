/*Primer parcial programación 1 - TUDAI 19/4/2018
Escribir un programa que mientras el usuario ingrese un número distinto de 0, pida ingresar un carácter e imprima:
 “digito” (‘0’, ‘1’,… ,‘9’) si el carácter ingresado es dígito, en cuyo caso además deberá imprimir si el número
ingresado previamente es o no múltiplo de 3 y 5;
 o “vocal minúscula” si el carácter ingresado es vocal;
 u “otro” para los restantes caracteres ingresados.*/
package Practicos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class parcial01 {

	public static void main(String[] args) {
		int entero = -1;
		int numero;
		String caracter;
		while (entero != 0) {
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un número distinto de 0 para entrar.\n o Precione 0 para salir");
				entero = new Integer (entrada.readLine());

				if (entero != 0) {
					System.out.println("Ingrese un caracte");
					caracter = new String(entrada.readLine());
					switch (caracter.charAt(0)) {
					case '0': entero = 0;
						break;
					case '1': 
					case '2': 
					case '3': 
					case '4': 
					case '5': 
					case '6': 
					case '7': 
					case '8': 
					case '9':
						System.out.println("Digito");
						numero = Integer.parseInt(caracter);
						 if ((numero%5 == 0) && (numero%3 == 0)) {
							 System.out.println("Es multiplo de 3 o 5");
						}
						break;
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						System.out.println("Volcal");
						break;

					default: System.out.println("Otro");
					break;
					}

				}
			}catch (Exception exc) {
				System.out.println(exc);
				//entero = -1;
			}
		}
		System.out.println("El programa a terminado, adios.");
	}

}
