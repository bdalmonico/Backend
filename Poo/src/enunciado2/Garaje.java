package enunciado2;

public class Garaje {
	private Coche coche = null;
	private String averia = null;
	private int numeroCochesEnAtencion = 0;
	
	public Garaje() {		
	}
	
	public boolean aceptarCoche(Coche coche, String averia) {
		if (numeroCochesEnAtencion==0) {
			numeroCochesEnAtencion++;
			this.coche = coche;
			this.averia = averia;
			if (averia.equalsIgnoreCase("aceite")) {
				Motor motor = this.coche.getMotor(); 
				motor.setLitrosAceite(motor.getLitrosAceite()+10);
			}
			return true;
		} else {
			return false;
		}
	}
	
	public Coche devolverCoche() {
		numeroCochesEnAtencion = 0;
		return coche;
	}
	
}
