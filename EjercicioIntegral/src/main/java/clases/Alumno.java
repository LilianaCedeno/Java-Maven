package clases;
import java.util.ArrayList;
import interfaz.IProyecto;

public class Alumno extends Persona implements IProyecto{
	
	protected Integer asistencia;
	protected ArrayList<Evaluacion> evaluaciones;
	
	public Alumno() {
		super();
		evaluaciones = new ArrayList<Evaluacion>();
		setAsistencia();
		setEvaluaciones();
		
	}

	public Integer getAsistencia() {
		return asistencia;
	}

	public void setAsistencia() {
		System.out.println("Ingrese la Asistencia del Alumno.");
		asistencia = leer.nextInt();
		leer.nextLine();
	}

	public ArrayList<Evaluacion> getEvaluaciones() {
		return evaluaciones;
	}

	public void setEvaluaciones() {
				
		System.out.println("Desea Agregar otra nota si/no");
		String op= null;
		
		Evaluacion n = new Evaluacion();
		evaluaciones.add(n);
		
		while (op == "si") {
				
				
			}
			
		}

}
