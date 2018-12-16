import java.util.*;
import javax.swing.*;

public class areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opción \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el largo del lado"));
			System.out.println("El area del Cuadrado es " + Math.pow(lado, 2));
			break;
		
		case 2:
			int ancho = Integer.parseInt(JOptionPane.showInputDialog("Introduce el largo de la base"));
			int alto = Integer.parseInt(JOptionPane.showInputDialog("Introduce el alto"));
			
			System.out.println("El area del Rectangulo es " + alto*ancho);
			break;

		case 3:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el largo de la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del Triangulo es " + (altura*base)/2);
			break;	
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce radio"));
			
			System.out.print("El area del Circulo es ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
			
		default:
			System.out.println("La opción no es correcta");	
		}
	}

}
