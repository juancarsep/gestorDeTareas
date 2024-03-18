package ar.edu.ort.tp1.examen.clases;

public abstract class TareaVencible extends Tarea implements Vigencia {

	private Fecha fechaVenc;

	public TareaVencible(Tipo tipo, Prioridad prio, String descripcion, int dia, int mes, int anio, int dia2, int mes2, int anio2) {
		super(tipo, prio, descripcion, dia, mes, anio);
		this.fechaVenc = new Fecha(dia2,mes2,anio2);
	}
	
	
	
	
	
	public Fecha getFechaVenc() {
		return fechaVenc;
	}

	private void setFechaVenc(int dia, int mes, int anio) {
		
	}
	
	public String obtenerMensajeVenc() {
		String mensaje;
		if(this.estaVencido()) {
			mensaje = "está vencida";
		}else {
			mensaje = "no está vencida";
		}
		return mensaje;
	}

	@Override
	public void mostrar() {
		System.out.println(
				"Descripcion: " + super.getDescripcion() + "\n" +
				"Prioridad: " + super.getPrioridad() + "\n" + 
				"Fecha de inicio: " + super.getFechaInicio().toString() + "\n" +
				obtenerMensajeVenc()	
				);		
	}

	@Override
	public boolean estaVencido() {
		return false;
	}

	@Override
	public boolean estaVigente() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
