package poo;

public class auto {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	 
	public auto() {
		ruedas=4;
		largo=2000;
		ancho= 300;
		motor=1600;
		peso_plataforma=500;
	}
	
	public String pasar_datos_generales() {
		return "La plataforma del auto tiene " + ruedas + " ruedas. "+
	"Mide "+largo/1000+ " metros con un ancho de "+ancho+
	" cm y un peso de plataforma de "+peso_plataforma+" kg";
	}
	
	public String pasar_largo() { // Metodo GETTER
		return "El largo del coche es " + largo + "cm";
	}
	
	public void config_asientos(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		} else {
			this.asientos_cuero=false;
		}
	}
	public String pasar_asientos() {
		if (asientos_cuero==true) {
			return "El vehículo tiene asientos de cuero";
		} else {
			return "El vehículo tiene asientos de serie"; 
		}
	}
	public void establecer_color(String color_coche) { // Metodo SETTER
		color=color_coche;
	}
	
	public String pasar_color() {
		return "El color del coche es "+ color;
	}
	
	public void config_climatizador (String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		} else {
			this.climatizador=false;
		}
	}
	public String pasar_climatizador() {
		if(climatizador==true) {
			return "El auto tiene Aire Acondicionado";
		} else {
			return "El auto no tiene Aire Acondicionado";
		}
	}
	public String pasar_peso_auto() {
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
		return "El peso total del auto es " + peso_total;
	}
	public int precio_auto() {
		int precio_final=10000;
		if (asientos_cuero==true) {
			precio_final += 2000;
		}
		if (climatizador==true) {
			precio_final += 1500;
		}
		return precio_final;
	}
}
