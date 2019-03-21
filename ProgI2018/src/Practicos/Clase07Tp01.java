package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase07Tp01 {
	final static int MAX = 10;
	public static void main(String args[]) {
		int arr[]=new int[MAX];
		for (int  i=0;i<MAX;i++) {
			arr[i] = obtenerEnteros();
		}
		for (int h=0;h<MAX;h++) {
			System.out.println(arr[h]);
		}
	}
	private static int obtenerEnteros() {
		int aux = (int)Math.round(Math.random()*100); 
		return aux;
	}

}

//public class Clase07Tp01 {
//	final static int MAX = 2;
//	public static void main(String args[]) {
//		//MAS ADELANTE HABRÍA QUE MODULARIZAR LA INICIALIZACION, CARGA E IMPRESION
//		int B[]=new int[MAX];
//		for (int con=0;con<MAX;con++) {
//			System.out.println ("Ingrese integer: "+con);
//			B[con]=obtenerEntero();
//		}
//		for (int con=0;con<MAX;con++)
//			System.out.println(B[con]);
//	}
//	public static int obtenerEntero(){
//		int valor = 0;
//		boolean enterovalido = false;
//		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
//		do {
//			try {
//				valor = new Integer(entrada.readLine());
//				enterovalido = true;
//			}
//			catch (Exception exc ) { enterovalido = false; }
//		} while (!enterovalido);
//		return valor;
//	}
//}