package Practicos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class parcial1 {


	public static void main(String[] args) {
		int entero = 0;
		do {
			entero = pediringreso();
			if (entero != 0) {
				pedircaracter();
			}
		}while (entero != 0);
		System.out.println("El programa a terminado, adios.");
	}

	private static int pediringreso() {
		int numero = 0;
		boolean valido;
		char caracter;
		try {
			do {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un número distinto de 0 para entrar.\n o Precione 0 para salir");
				caracter = (char) entrada.readLine().charAt(0);
				valido = isnumber(caracter);
				if (valido == false) {
					System.out.println("Ingreso una letra o simbolo.\nValor ingresado: "+caracter);
				}
			}while(valido == false);
			numero = caracter - '0';
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return numero;
	}

	private static boolean isnumber(char caracter) {
		final int MAX = 10;
		final int MIN = 0;
		char [] numeros = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
		for (int i=MIN; i<MAX;i++) {
			if (caracter == numeros[i]) {
				return true;
			}
		}
		return false;
	}

	private static void pedircaracter() {
		char caracter;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter");
			caracter = (char) entrada.readLine().charAt(0);
			caratertipo(caracter);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	private static void caratertipo(char caracter) {
		final int MAX = 5;
		final int MIN = 0;
		int num = 0;
		final char [] vocal = {'a', 'e', 'i', 'o', 'u'};
		//       if (Character.isDigit(caracter)) { // sustituido por funcion local isnumber(char)
		if (isnumber(caracter)) {
			System.out.println("Es un número");
			// 		int num = Character.getNumericValue(caracter); // sustituido por variable local
			num = caracter - '0';
			multiplo(num);
			//      	} else if (Character.isLetter(caracter)) { // sustituido por funcion local isleter(char)
		} else if (isleter(caracter)) { 
			System.out.println("Es una letra");
			for (int i=MIN; i<MAX;i++) {
				if (caracter == vocal[i]) {
					System.out.println("Es vocal minúscula");
				}
			}
		} else {
			System.out.println("Otro");
		}
	}

	private static boolean isleter(char caracter) {
		final int MAX = 27;
		final int MIN = 0;
		final char [] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
				'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z'};
		for (int i=MIN; i<MAX;i++) {
			if (caracter == letras[i]) {
				return true;
			}
		}
		return false;
	}

	private static void multiplo(int num) {
		System.out.println(num);
		if (num%3 == 0) {
			System.out.println("El número ingresado es multiplo de 3\n");
		} else if (num%5 == 0) {
			System.out.println("El número ingresado es multiplo de 5\n");
		}
	}
}
