package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lea una cantidad en nuevos soles y obtenga su equivalencia en euros. 
		//Debe leer tambi�n el tipo de cambio del d�a (es decir, a cu�nto equivale un euro en nuevos soles).
		
		int monto; // monto en sol
		int euro; // conversi�n a dolar
		int d�a=4;
			
		monto = Integer.parseInt(JOptionPane.showInputDialog("Introduce monto en soles -> "));	
		
		euro = (monto*4);
							
		System.out.println("El monto es: " + monto);
		System.out.println("El cambio del d�a es: " + d�a);
		System.out.println("El monto en Euro es: " + euro);		
	}
	
}
