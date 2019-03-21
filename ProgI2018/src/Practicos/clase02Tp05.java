/*Escribir un programa que pida que se ingresen datos
necesarios para emitir una factura por la compra de dos
artículos de librería (tipo factura, número, nombre cliente,
producto 1, importe 1, producto 2, importe 2, importe total).
Como salida debe imprimir por pantalla la factura en un
formato similar al del siguiente ejemplo:
---------------------------------
|Factura 		C 		N 221	|
|Jorge Rodriguez				|
|Producto 				importe |
|Pala 					12.2	|
|Alambre 				20.0	|
|Importe Total 			32.2	|
---------------------------------
*/

package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
	public class clase02Tp05 {

	public static void main(String[] args) {
		char tipoFact;
		int numfact;
		double importe1, importe2, total;
		String nombreCliente, prod1,prod2;
		try {
			BufferedReader ingreso = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese tipo de factura (A,B,C)");
			tipoFact = (char) (ingreso.readLine().charAt(0));
			System.out.println ("Ingrese número de factura");
			numfact = new Integer(ingreso.readLine());	
			System.out.println ("Ingrese nombre de cliente");
			nombreCliente = new String(ingreso.readLine());	
			System.out.println ("Ingrese producto");
			prod1 = new String(ingreso.readLine());	
			System.out.println("Ingrese el importe");
			importe1 = new Double(ingreso.readLine());	
			System.out.println ("Ingrese producto");
			prod2 = new String(ingreso.readLine());	
			System.out.println("Ingrese el importe");
			importe2 = new Double(ingreso.readLine());	
			total = importe1 + importe2;
			System.out.println("Factura \t"+tipoFact+"\t N "+numfact+"\n"+nombreCliente+
					"\nProducto \t\t Importe\n"+ prod1+ "\t\t\t" + importe1 +"\n"+prod2+ "\t\t\t" + importe2 +"\n"
					+"Importe total: \t\t"+ total);

		}
		catch (Exception exc ) {
			System.out.println( exc );
		}

	}

}