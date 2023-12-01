package enunciado1;

public class Alumno {
	private Asignatura[] asignaturas = null;
	
	public Alumno(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public Alumno(int[] ids) {
		this.asignaturas = new Asignatura[ids.length];
		for (int i = 0; i<ids.length;i++) {
			asignaturas[i] = new Asignatura(ids[i]);
		}

	}
	
	public Asignatura[] getAsignaturas() {
		return this.asignaturas;
	}
	
}
