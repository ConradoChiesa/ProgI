package poo;

import java.util.*;

public class uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		empleado empleado01 = new empleado("Josesito", 85000, 2017,04, 17);
//		empleado empleado02 = new empleado("Paturuzu", 95000, 1995,06, 02);
//		empleado empleado03 = new empleado("Pedrito", 65000, 2011,13, 12);
//		
//		empleado01.payMore(5);
//		empleado02.payMore(5);
//		empleado03.payMore(5);
//		
//		System.out.println("Nombre: " + empleado01.getName() + 
//						   " Sueldo: " + empleado01.getPayment() +
//						   " Fehca de alta: " + empleado01.getDateUp()); 
//		System.out.println("Nombre: " + empleado02.getName() + 
//				   			" Sueldo: " + empleado02.getPayment() +
//				   			" Fehca de alta: " + empleado02.getDateUp()); 
//		System.out.println("Nombre: " + empleado03.getName() + 
//							" Sueldo: " + empleado03.getPayment() +
//							" Fehca de alta: " + empleado03.getDateUp()); 
		
		empleado[] misEmpleados = new empleado[3];
		misEmpleados[0]=new empleado("Jesito",85000,2017, 04, 17);
		misEmpleados[1]=new empleado("Paturuzu", 95000, 1995,06, 02);
		misEmpleados[2]=new empleado("Pedrito", 65000, 2011,13, 12);
		
		for (int i=0; i<3;i++) {
			misEmpleados[i].payMore(5);
		} 
		
		for(empleado e: misEmpleados) {
			e.payMore(5);
		}
		
		for(empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.getName() + 
					" Sueldo: " + e.getPayment() +
					" Fehca de alta: " + e.getDateUp());
		}

	
	/*	for (int i=0; i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].getName() + 
							" Sueldo: " + misEmpleados[i].getPayment() +
							" Fehca de alta: " + misEmpleados[i].getDateUp());
									}*/
	} 

}

class empleado{
	
	public empleado(String name, double payment, int year, int mounth, int day) {
	
		namer=name;
		pay=payment;
		GregorianCalendar calendario = new GregorianCalendar(year, mounth-1, day);
		dateUp = calendario.getTime();
		
		
	}
	
	public String getName() {
		return namer;
	}
	
	public double getPayment() {
		return pay;
	}
	
	public Date getDateUp() {
		return dateUp;
	}
	
	public void payMore(double percent) {
		double aumento=pay*percent/100;
		pay += aumento;
		
	}
	private String namer;
	private double pay;
	private Date dateUp;
	
	
}
