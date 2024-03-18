package ar.edu.ort.tp1.examen.clases;

public class Bug extends TareaVencible {
	
	private final static Tipo TIPO = Tipo.BUG; 
	private boolean esCritico;
	
	public Bug(Prioridad prio, String descripcion, int dia, int mes, int anio, int dia2, int mes2, int anio2, boolean esCrit ) {
		super(TIPO, prio, descripcion, dia, mes, anio, dia2, mes2, anio2);
		this.esCritico = esCrit;
	}
	
	
	//Al mostrarse, las tareas, deberán mostrar por consola su tipo, descripción, prioridad, fecha de inicio
	//e indicar si están o no vencidas, además de las particularidades de cada una. (ver salida provista)


	
	@Override
	public void mostrar() {
		System.out.println(
							"Tipo: " + this.TIPO + "\n" +
							"Descripcion: " + super.getDescripcion() + "\n" +
							"Prioridad: " + super.getPrioridad() + "\n" + 
							"Fecha de inicio: " + super.getFechaInicio().toString() + "\n" +
							obtenerMensajeVenc() + "\n" + 
							((this.esCritico) ? "Es critico" : "No es critico")
				);		
	}

	@Override
	public boolean estaVencido() {
		boolean vencido = false;
		long diasQuePasaronDesdeVenc = super.getFechaVenc().diasDesde(Fecha.hoy());
		
		
		if(this.esCritico && (diasQuePasaronDesdeVenc > 0)) {
			vencido = true;
		}else if(!this.esCritico && (diasQuePasaronDesdeVenc > 10) ) {
			vencido = true;
		}
		
		
		return vencido;
	}

	@Override
	public boolean estaVigente() {
		return this.estaVencido() ;
	}



}
