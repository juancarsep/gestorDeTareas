package ar.edu.ort.tp1.examen.clases;

public class Auditoria extends TareaVencible {
	
	private final static Tipo TIPO = Tipo.AUDITORIA;
	private boolean esExterna;
	
	
	public Auditoria(Prioridad prio, String descripcion, int dia, int mes, int anio, int dia2, int mes2, int anio2, boolean esExterna ) {
		super(TIPO, prio, descripcion, dia, mes, anio, dia2, mes2, anio2);
		this.esExterna = esExterna;
	}
	
	

	
	@Override
	public boolean estaVencido() {
		long diasQuePasaronDesdeVenc = super.getFechaVenc().diasDesde(Fecha.hoy());
		boolean vencido = false;
		
		if(diasQuePasaronDesdeVenc < 0) {
			vencido = true;
		}
		
		return vencido;
	}

	@Override
	public boolean estaVigente() {
		return !this.estaVencido();
	}

	@Override
	public void mostrar() {
		System.out.println(	"Tipo: " + this.TIPO + "\n" +
							"Descripcion: " + super.getDescripcion() + "\n" +
							"Prioridad: " + super.getPrioridad() + "\n" + 
							"Fecha de inicio: " + super.getFechaInicio().toString() + "\n" +
							obtenerMensajeVenc() + "\n" + 
							((this.esExterna) ? "Es externa" : "Es interna")
							);			
	}

}
