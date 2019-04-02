package Practicos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class clase03Tp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numerador,denominador,baseResta;
//		float resultado;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese numerador:");
			numerador=new Float(entrada.readLine());
			System.out.println("Ingrese denominador:");
			denominador=new Float(entrada.readLine());
			System.out.println("Ingrese número a restar");
			baseResta=new Float(entrada.readLine());			
//	Estas 3 lines fueron mejoradas a la siguiente y se uso una variable menos.		
/*			resultado = numerador/denominador;
			resultado -= baseResta;
			System.out.printf("%1.2f", resultado);*/
			System.out.println("El primero sobre el segundo menos el tercero da: " +(numerador/denominador-baseResta));	
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
