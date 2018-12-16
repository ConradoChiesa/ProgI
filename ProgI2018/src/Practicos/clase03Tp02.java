package Practicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase03Tp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese dividendo");
			int dividendo = new Integer(entrada.readLine());
			int divisor = 2;
			System.out.println(dividendo/divisor);
			divisor ++;
			System.out.println(dividendo/divisor);
			divisor ++;
			System.out.println(dividendo/divisor);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
