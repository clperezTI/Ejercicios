package com.senati.clase01;

import javax.swing.JOptionPane;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se ingresa el lado L de un cuadrado.
		//Calcular su perímetro y su área. Se sabe que Perímetro=4L y Área=L2
		
		int l; // lado de uncuadrado
		int perimetro; // perimetro del cuadrado
		int area; // area del cuadrado
		
		l = Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado -> "));	
		
		perimetro = 4*l;
		area = l*2;
				
		System.out.println("El perímetro es: " + perimetro);
		System.out.println("El área es: " + area);
	}

}
