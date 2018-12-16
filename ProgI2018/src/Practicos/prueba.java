package Practicos;

public class prueba {
	public static void main (String [] args) {
		final int MAX = 10;
		final int MULTIPLO = 3;
		System.out.println("Tablas de multiplicar del 1, 2 y 3");
		for (int i=1; i<=MULTIPLO; i++) {
			System.out.println("Tabla de multiplicar del " + i);
			for (int j=1; j<=MAX; j++) {
				System.out.println(j + " * " + i + "= " + j*i );
			}
		}
	}
}
