package com.senati.clase01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En un taller se hace un 30% de descuento a los clientes cuya compra supere
		//los $3000, y 20% si es menor. 
		//¿Cuál será la cantidad que pagará una persona cualquiera por su compra?
		
		
		float total;
		float descuento;
		float total_pago;
		DecimalFormat df = new DecimalFormat("#.00");
		
		total = Float.parseFloat(JOptionPane.showInputDialog("introduce el total de su compra "));
		if (total > 3000) {
			descuento = total * 0.3f;
		}else {
			descuento= total * 0.2f;
		}
		
		total_pago = total - descuento;
		
		System.out.println("Total : " + df.format(total) );
		System.out.println("Descuento : " + df.format(descuento) );
		System.out.println("Total pago : " + df.format(total_pago) );
	}

}
