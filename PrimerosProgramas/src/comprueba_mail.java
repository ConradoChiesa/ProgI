import javax.swing.JOptionPane;

public class comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arroba = 0;
		boolean punto = false;
		String mail = JOptionPane.showInputDialog("Introduzca un e-mail");
		for ( int i=0; i<mail.length(); i++) {
			if (mail.charAt(i)=='@'){
					arroba++;
			}
			if (mail.charAt(i)== '.') {
				punto = true;
			}
		}
		if (arroba==1 && punto==true) {
			System.out.println("E-mail valido");
		}else {
			System.out.println("E-mail invalido");	
		}
	}

}
