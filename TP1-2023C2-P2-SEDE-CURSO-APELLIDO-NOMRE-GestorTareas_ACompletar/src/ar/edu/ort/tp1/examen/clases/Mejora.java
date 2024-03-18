package ar.edu.ort.tp1.examen.clases;

public class Mejora extends Tarea {

	private final static Tipo TIPO = Tipo.MEJORA;
	private String sistemaAMejorar;

	
	
	
	
	public Mejora(Prioridad prio, String descripcion, int dia, int mes, int anio, String sistemaAMejorar) {
		super(TIPO, prio, descripcion, dia, mes, anio);
		this.sistemaAMejorar = sistemaAMejorar;
	}









	
	
	
	
	
	
	
	
	
	@Override
	public void mostrar() {
		System.out.println( "Descripcion: " + super.getDescripcion() + "\n" +
							"Prioridad: " + super.getPrioridad() + "\n" + 
							"Fecha de inicio: " + super.getFechaInicio().toString() + "\n" +
							"Se mejorara el sistema: " + this.sistemaAMejorar
						  );		
	}
	
}
