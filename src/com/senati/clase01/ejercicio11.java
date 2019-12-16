package com.senati.clase01;

import javax.swing.JOptionPane;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 11 Calcular el nuevo salario neto de un obrero si obtuvo un
		 * incremento del 25% sobre su salario anterior y debe pagar al seguro social 5%
		 * de su nuevo sueldo
		 */
		int l; // salario
		int incremento; // incremento 25%
		int seguro; // seguro social
		
		l = Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario -> "));	
		
		incremento = l*25/100 + l;
		seguro = incremento*5/100;
			
		System.out.println("El salario inicial es: "+l );
		System.out.println("El incremento es: " + incremento);
		System.out.println("El seguro es: " + seguro);
		
	}

}