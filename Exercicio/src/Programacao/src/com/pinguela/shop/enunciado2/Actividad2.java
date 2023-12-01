package Programacao.src.com.pinguela.shop.enunciado2;

import java.util.Random;

public class Actividad2 {

	public static void main(String[] args) {
		Random r = new Random(System.currentTimeMillis());
		double coste;

		Garaje garaje = new Garaje();
		Coche c1 = new Coche("Ford", "Fiesta");
		c1.setMotor(new Motor(130));
		
		Coche c2 = new Coche("Seat", "600");
		c2.setMotor(new Motor(30));

		if (garaje.aceptarCoche(c1, "Cambiar el aceite")) {
			coste = r.nextDouble()*100;
			c1.acumularAveria(coste);
		} else {
			System.out.println(c1+" rechazado");
		}
		
		if (garaje.aceptarCoche(c2, "Pinchazo")) {
			coste = r.nextDouble()*100;
			c2.acumularAveria(coste);			
		} else {
			System.out.println(c2+" rechazado");
		}
			 
		garaje.devolverCoche();
		
		if (garaje.aceptarCoche(c2, "Junta culata")) {
			coste = r.nextDouble()*2000;
			c2.acumularAveria(coste);			
		} else {
			System.out.println(c2+" rechazado");
		}
		
	}

}
