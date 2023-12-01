package enunciado1;

public class Actividad1 {

	public static void main(String args[]) {
		
		
		
		Asignatura[] asignaturas = new Asignatura[3];
		asignaturas[0] = new Asignatura(45);
		asignaturas[1] = new Asignatura(8);
		asignaturas[2] = new Asignatura(3);

		
		/*
		Asignatura[] asignaturas = new Asignatura[] {
				new Asignatura(45), 
				new Asignatura(3),
				new Asignatura(8)				
				};
		*/
		
		Alumno alumno = new Alumno(asignaturas);
		Profesor profesor = new Profesor();
		profesor.setMetodoRedondeo(Profesor.REDONDEO_ARRIBA);
		
		profesor.ponerNotas(alumno);
		double notaMedia = Profesor.calcularMedia(alumno);
		double notaRedondeada =  profesor.redondearNota(notaMedia);
		System.out.println("Nota media é: " + notaMedia 
						+", Nota redondeada é:  "+notaRedondeada);
	}
}
