package ar.edu.ort.tp1.examen.clases;
//TODO
public abstract class Tarea implements Mostrable  {

	private static final String MSG_PRIORIDAD_INVALIDA = "Prioridad inv�lida";
	private static final String MSG_FECHA_INVALIDA = "Fecha de inicio inv�lida";
	private static final String MSG_DESCRIPCION_INVALIDA = "La descripcion no puede ser nula ni vac�a";
	private Tipo tipo;
	private Prioridad prioridad;
	private String descripcion;
	private Fecha fechaInicio;
	
	public Tarea(Tipo tipo, Prioridad prio, String descripcion, int dia, int mes, int anio) {
		this.tipo = tipo;
		setPrioridad(prio);
		setDescripcion(descripcion);
		setFecha(dia, mes, anio);
	}

	
	private void setFecha(int dia, int mes, int anio) {
		
		Fecha fecha = new Fecha(dia, mes, anio);
		if(fecha == null) {
			throw new IllegalArgumentException(MSG_FECHA_INVALIDA);
		}
		this.fechaInicio = fecha;
		
	}
	
	private void setPrioridad(Prioridad prio) {
		if(prio == null) {
			throw new IllegalArgumentException(MSG_PRIORIDAD_INVALIDA);
		}
		
		this.prioridad = prio;
		
	}
	
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if(descripcion == null || descripcion == "") {
			throw new IllegalArgumentException(this.MSG_DESCRIPCION_INVALIDA);
		}
		this.descripcion = descripcion;
	}

	public Fecha getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Fecha fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public static String getMsgPrioridadInvalida() {
		return MSG_PRIORIDAD_INVALIDA;
	}

	public static String getMsgFechaInvalida() {
		return MSG_FECHA_INVALIDA;
	}

	public static String getMsgDescripcionInvalida() {
		return MSG_DESCRIPCION_INVALIDA;
	}
	
	
	
}
