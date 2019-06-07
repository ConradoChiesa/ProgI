package Practicos;
public class prueba {
	public static final int a = 2;//constante global a todos
	public static int b = 2;//variable global a todos
	public static void main(String[] args) {
		int a = 3;//local a main
		System.out.println ("a = "+a);
		System.out.println ("b = "+b);
		imprimir();
	}
	public static void imprimir() {
		
		System.out.println(a);
	}
}