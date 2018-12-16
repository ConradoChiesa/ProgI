package Practicos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Locale;

public class ordena_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, num3, num4, num5;
		num1=0;
		num2=0;
		num3=0;
		num4=0;
		num5=0;
		try {
			System.out.println("Ingrese un número");
			num1 = new Integer(entrada.readLine());
			System.out.println("Ingrese un número");
			num2 = new Integer(entrada.readLine());
			System.out.println("Ingrese un número");
			num3 = new Integer(entrada.readLine());
			System.out.println("Ingrese un número");
			num4 = new Integer(entrada.readLine());
			System.out.println("Ingrese un número");
			num5 = new Integer(entrada.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(num5);
		System.out.println(num4);
		System.out.println(num3);
		System.out.println(num2);
		System.out.println(num1);
	}

}
