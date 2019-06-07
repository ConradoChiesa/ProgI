package Practicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase07Tp01 {
	final static int MAX = 10;
	final static int MAX_ENT = 100;
	public static void main(String args[]) {
		int num, pos;
		int arr[]=new int[MAX];
		llenararreglo(arr); //Lo llena de forma aleatoria
		ordenararr(arr); // Lo ordena de menor a mayor
		imprimirarr(arr); // Imprime el arreglo
		num=pedirvalor(); //Pide un valor entre 0 y 100
		pos=buscarvalor(arr, num);
		evaluarbusqueda(pos);
	
	}
	public static void evaluarbusqueda(int pos) {
		if (pos!=-1) {
			System.out.println("El valor ingresado se encuentra en la posición "+ (pos+1));
		} else {
			System.out.println("No se encontro el valor");
		}
	}
	public static int pedirvalor() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num=0;
		do {
			try {
				System.out.println("\nIngrese un valor");
				num = new Integer(entrada.readLine());
			} catch (Exception exc) {
				System.out.println(exc);
				num = 0;
			}
		} while((num<0)||(num>MAX_ENT));
		return num;
	}
	
	public static int buscarvalor(int[] arr, int buscado) {
		int pos=0, temp=-1;
		while ((pos<MAX)&&(arr[pos]<=buscado)) {
			if (arr[pos] == buscado) {
				temp=pos;
			}		
			pos++;
		}
		return temp;
	}
	
	public static void imprimirarr(int[] arr) {
		
		for (int h=1;h<=MAX;h++) {
			System.out.print(h+ ": " +arr[h-1]+"   ");
		}
	}
	
	public static void ordenararr(int[] arr) {
		int temp;
		for(int	i = 1;i < MAX;i++){
			for (int j = 0 ; j < MAX-1; j++){
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void llenararreglo(int[] arr) {
		for (int  i=0;i<MAX;i++) {
			arr[i] = obtenerEnteros();
		}		
	}
	public static int obtenerEnteros() {
		int temp = (int)(100*Math.random()+1); 
		return temp;
	}

}
