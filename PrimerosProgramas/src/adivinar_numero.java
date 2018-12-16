import java.util.*;
public class adivinar_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio = (int)(Math.random()*100);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		do {
			intentos++;
			System.out.println("Introduce un número de 1 a 100");
			numero = entrada.nextInt();
			if(aleatorio>numero) {
				System.out.println("El numero es más grande");
			} else {
				System.out.println("El numero es más chicos");
			}
		}while (numero != aleatorio);
		System.out.println("El número elegido es correcto");
		System.out.println("El número de intentos fue " + intentos);
	}

}
