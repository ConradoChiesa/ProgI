package poo;

import javax.swing.JOptionPane;

public class uso_auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		auto vehiculo=new auto();
		vehiculo.establecer_color(JOptionPane.showInputDialog("Introduce color"));
		vehiculo.config_climatizador(JOptionPane.showInputDialog("Desea que tenga AA? (si/no)"));
		vehiculo.config_asientos(JOptionPane.showInputDialog("Desea que tenga Asientos de cuero? (si/no)"));
		
		String longitud = vehiculo.pasar_largo();
		String color = vehiculo.pasar_color();
		String asientos = vehiculo.pasar_asientos();
		String climatizador = vehiculo.pasar_climatizador();
		String peso_auto = vehiculo.pasar_peso_auto();
		
		System.out.println(vehiculo.pasar_datos_generales());
		System.out.println(longitud);
		System.out.println(color);
		System.out.println(climatizador);		
		System.out.println(asientos);
		System.out.println(peso_auto);
		System.out.println("El precio final del auto es: "+ vehiculo.precio_auto());
		
	}

}
