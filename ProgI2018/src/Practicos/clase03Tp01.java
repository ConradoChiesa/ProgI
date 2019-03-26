package Practicos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class clase03Tp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerador,denominador,baseResta;
		float resultado;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese numerador:");
			numerador=new Integer(entrada.readLine());
			System.out.println("Ingrese denominador:");
			denominador=new Integer(entrada.readLine());
			System.out.println("Ingrese número a restar");
			baseResta=new Integer(entrada.readLine());			
			
			resultado = numerador/denominador;
			resultado -= baseResta;
			
			System.out.printf("%1.3f", resultado);
		//System.out.println(numerador/denominador-baseResta);	
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
