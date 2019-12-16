package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lea una cantidad en nuevos soles y obtenga su equivalencia en euros. 
		//Debe leer también el tipo de cambio del día (es decir, a cuánto equivale un euro en nuevos soles).
		
		int monto; // monto en sol
		int euro; // conversión a dolar
		int día=4;
			
		monto = Integer.parseInt(JOptionPane.showInputDialog("Introduce monto en soles -> "));	
		
		euro = (monto*4);
							
		System.out.println("El monto es: " + monto);
		System.out.println("El cambio del día es: " + día);
		System.out.println("El monto en Euro es: " + euro);		
	}
	
}
