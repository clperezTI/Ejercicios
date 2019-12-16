package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un número entero o decimal y mostrar su doble, triple, cuadrado y cubo.
		int n; // Numero entero o decimal
		int doble; // doble
		int triple; // triple
		int cuadrado; // cuadrado
		int cubo; // cubo
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número -> "));	
		
		doble = n*2;
		triple = n*3;
		cuadrado = (n*n);
		cubo = (n*n*n);
		
		System.out.println("El número es: " + n);
		System.out.println("El doble es: " + doble);
		System.out.println("El triple es: " + triple);
		System.out.println("El cuadrado es: " + cuadrado);
		System.out.println("El cubo es: " + cubo);
	}

}
