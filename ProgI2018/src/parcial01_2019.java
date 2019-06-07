import java.io.BufferedReader;
import java.io.InputStreamReader;
public class parcial01_2019 {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		final int multiplo7 = 7;
		final int multiplo11 = 11;
		int NUM = 0;
		char ingreso = ' ';
		boolean valid=false, letranum=false;
		
		do {
			do {
				try {
					System.out.println("ingrese un numero");
					NUM = new Integer (entrada.readLine());
					valid = true;
				} catch (Exception exc){
					System.out.println( exc );
					valid = false;
				}
			} while(!valid);
			
			// copia de la catedra
			// con modificaciones, lo hice andar con for
			if ((NUM % multiplo7 == 0)&&(NUM % multiplo11 == 0)){
				for (int i = 0; i < NUM; i++){
			//		ingresovalido = false;
				//	while (!ingresovalido) {
						try {
							System.out.println ("Ingrese un caracter: ");
							ingreso = entrada.readLine().charAt(0);
						}
						catch (Exception exc ) {
							System.out.println( exc );
						}
					//}
						letranum = false;
						for (char x='a';x<='z';x++) {
							if(ingreso == x) {
								System.out.println ("letra minuscula");
								letranum = true;
							}
						}
						for (char x='A';x<='Z';x++) {
							if(ingreso == x) {
								System.out.println ("letra mayuscula");
								letranum = true;
							}
						}
						for (char j='0';j<='9';j++) {
							if(ingreso == j) {
								System.out.println ("digito");
								letranum = true;
							}
						}
						if (!letranum) {
							System.out.println("Otro");
						}
//					if (('a'<= ingreso)&&(ingreso <= 'z')){
//						System.out.println ("letra minuscula");
//					}
//					else if (('A'<= ingreso)&&(ingreso <= 'Z')){
//						System.out.println ("letra mayuscula");
//					}
//					else if (('0'<= ingreso)&&(ingreso <= '9')){
//						System.out.println ("digito");
//					}
//					else {
//						System.out.println ("otro");
//					}
				}
			}
		}while((NUM%multiplo7==0)&&(NUM%multiplo11==0));
	}

}
