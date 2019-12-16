package com.senati.clase01;

public class data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int costo_alquiler = 30; // Costo por dia
		float costo_kr = 0.40f; // Costo por km adicional
		int nro_dias = 2; // Dias transcurridos
		int recorrido = 2002; // Recorrido final
		float monto_total = 0f; // Monto total dias * costo
		float monto_adicional = 0f; // recorrido adicional > 2000
		if (recorrido > 2000) { // Si el recorrido es mayor a 2000
			// Cuando es verdadero
			monto_total = nro_dias * costo_alquiler;
			monto_adicional = (recorrido - 2000)*costo_kr;
		}else {
			// Cuando no es verdadero
			monto_total = nro_dias * costo_alquiler;
			monto_adicional =0f;
		}
		System.out.println("Monto a pagar : " + (monto_total + monto_adicional));
	}

}
