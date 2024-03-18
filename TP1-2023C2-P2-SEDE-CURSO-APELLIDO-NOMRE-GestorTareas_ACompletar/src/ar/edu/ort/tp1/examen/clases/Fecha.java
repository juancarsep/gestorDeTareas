package ar.edu.ort.tp1.examen.clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Fecha {

	private LocalDate date;

	/**
	 * Constructor de una fecha - si el d�a indicado no es v�lido para el mes
	 * indicado, arrojar� un error. (por ejemplo un 30 de febrero)
	 * 
	 * @param dia  n�mero de d�a de la fecha, de 1 a la cantidad de d�as del mes
	 *             (28, 29, 30 o 31)
	 * @param mes  n�mero de mes de la fecha, de 1 a 12
	 * @param anio n�mero de a�o
	 */
	public Fecha(int dia, int mes, int anio) {
		date = LocalDate.of(anio, mes, dia);
	}

	private Fecha(LocalDate date) {
		this.date = date;
	}

	/**
	 * Indica la diferencia, en d�as, desde la fecha actual y la pasada por
	 * par�metro
	 * 
	 * @param otraFecha la otra fecha
	 * @return La diferencia en d�as
	 */
	public long diasDesde(Fecha otraFecha) {
		return ChronoUnit.DAYS.between(this.date, otraFecha.date);
	}

	public static Fecha hoy() {
		return new Fecha(LocalDate.now());
	}
	
	@Override
	public String toString() {
		return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
