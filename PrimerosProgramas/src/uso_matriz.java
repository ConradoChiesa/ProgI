import javax.swing.JOptionPane;

public class uso_matriz {
	public static void main(String[] args) {
		int [] matriz_aleatoria = new int[150];
		for (int i=0;i<matriz_aleatoria.length;i++) {
			matriz_aleatoria[i]= (int)Math.round(Math.random()*100);
		}
		for (int elemento:matriz_aleatoria) {
			System.out.print(elemento+ " ");
		}
	}
}
