package ar.edu.ort.tp1.examen;

import ar.edu.ort.tp1.examen.clases.Gestor;
import ar.edu.ort.tp1.examen.clases.Mejora;
import ar.edu.ort.tp1.examen.clases.Prioridad;
import ar.edu.ort.tp1.examen.clases.TareaAuditoria;
import ar.edu.ort.tp1.examen.clases.TareaBug;

public class Test {

	public static void main(String[] args) {

		Gestor gestor = new Gestor();

		registrarTareas(gestor);
		System.out.println("-".repeat(80));
		listarTareas(gestor);

	}

	private static void registrarTareas(Gestor gestor) {

		System.out.println("Test - Registrando tareas");
		registrarTareaNula(gestor);
		registrarAuditoria(gestor, "Servidores sistema Compra sin actualizaci�n", 2, 6, 2023, Prioridad.MEDIA, 2, 9,
				2024, false);
		registrarAuditoria(gestor, "Alta digital clientes sin prueba de vida", 15, 5, 2023, Prioridad.ALTA, 14, 6, 2023,
				true);
		registrarAuditoria(gestor, "No conformidad documentacion Alta Digital", 28, 2, 2023, Prioridad.BAJA, 10, 3,
				2023, false);
		registrarTareaNula(gestor);
		registrarAuditoria(gestor, null, 10, 7, 2022, Prioridad.MEDIA, 3, 10, 2022, false);
		registrarAuditoria(gestor, "Central de auditoria Fecha inicio mal", 30, 2, 2023, Prioridad.MEDIA, 10, 11, 2023,
				true);

		registrarBug(gestor, "T�tulo mal mostrado", 7, 10, 2023, Prioridad.MEDIA, 18, 11, 2023, false);
		registrarTareaNula(gestor);
		registrarBug(gestor, "Fecha Vto Error", 1, 1, 2023, Prioridad.BAJA, 31, 2, 2023, true);
		registrarBug(gestor, "Listado de clientes desordenado", 30, 9, 2023, Prioridad.MEDIA, 19, 11, 2023, false);
		registrarBug(gestor, "Fe de vida falla en todos los casos", 10, 10, 2022, Prioridad.ALTA, 19, 11, 2022, true);

		registrarMejora(gestor, "Mejora sin prioridad", 1, 1, 2022, null, "Mejora sin prioridad");
		registrarTareaNula(gestor);
		registrarMejora(gestor, "Nuevo formato pantalla login", 30, 9, 2023, Prioridad.MEDIA, "ABM Clientes");
		registrarMejora(gestor, "Soportar clientes con condici�n final", 1, 8, 2023, Prioridad.ALTA, "ABM Clientes");
		registrarMejora(gestor, "Emisi�n de facturas electr�nicas", 1, 3, 2019, Prioridad.MEDIA, "ERP");
		registrarTareaNula(gestor);
		registrarMejora(gestor, "Quitar campo tel�fono fijo", 1, 5, 2022, Prioridad.MEDIA, "Vendedores");
	}

	// TODO
	private static void registrarTareaNula(Gestor gestor) {

		gestor.registrarTarea(null);
		System.out.println("Tarea nula registrada");
	}

	// TODO
	private static void registrarAuditoria(Gestor gestor, String descripcion, int diaInicio, int mesInicio,
			int anioInicio, Prioridad prioridad, int diaVto, int mesVto, int anioVto, boolean externa) {

		gestor.registrarTarea();
	}

	// TODO
	private static void registrarBug(Gestor gestor, String descripcion, int diaInicio, int mesInicio, int anioInicio,
			Prioridad prioridad, int diaVto, int mesVto, int anioVto, boolean critico) {

		gestor.registrarTarea();
	}

	// TODO
	private static void registrarMejora(Gestor gestor, String descripcion, int diaInicio, int mesInicio, int anioInicio,
			Prioridad prioridad, String sistema) {

		gestor.registrarTarea();
	}

	private static void listarTareas(Gestor gestor) {

		System.out.println("-Prioridad Media ---------------------------- ");
		gestor.listarTareasPorDescripcion(Prioridad.MEDIA);
	}

}
