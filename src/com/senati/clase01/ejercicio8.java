package com.senati.clase01;

import javax.swing.JOptionPane;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se ingresa el lado L de un cuadrado.
		//Calcular su per�metro y su �rea. Se sabe que Per�metro=4L y �rea=L2
		
		int l; // lado de uncuadrado
		int perimetro; // perimetro del cuadrado
		int area; // area del cuadrado
		
		l = Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado -> "));	
		
		perimetro = 4*l;
		area = l*2;
				
		System.out.println("El per�metro es: " + perimetro);
		System.out.println("El �rea es: " + area);
	}

}
