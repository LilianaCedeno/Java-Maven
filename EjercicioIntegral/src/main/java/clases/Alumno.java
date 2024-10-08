package clases;
import java.util.*;
import interfaz.IProyecto;

public class Alumno extends Persona implements IProyecto{
	
	protected Integer asistencia;
	protected Double promedio;
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
		  while (true) {
	            try {
	                System.out.print("Ingrese la asistencia del alumno (0-100): ");
	                asistencia = leer.nextInt();
	                leer.nextLine();
	                if (asistencia <= 0 || asistencia > 100) {
	                    throw new Exception("La asistencia debe ser mayor que 0 y menor o igual a 100.");
	                }
	                break; 
	            } catch (Exception e) {
	                System.out.println(e.getMessage());
	            leer.next(); 
	            }
	        }
	}

	public ArrayList<Evaluacion> getEvaluaciones() {
		return evaluaciones;
	}

	public void setEvaluaciones() {
				
				for(int i=0; i<3; i++) {
				Evaluacion n = new Evaluacion();
				evaluaciones.add(n);
				
				}
			
	}
	
	public Double getPromedio() {
		return promedio;
	}
	
	 public void setPromedio() {
		 double suma = 0.0;

	        // sumoa las notas de las evaluaciones
		 
	        for (Evaluacion eval : evaluaciones) {
	            suma += eval.getNota(); 
	        }

	        promedio = suma / 3;

	   }



	 public String calcularSituacionFinal(int asistenciaMinima) {
		     
		    setPromedio();
		 	
	        if (promedio >= 4.0 && asistencia >= asistenciaMinima) {
	            return "AA"; // Aprobados
	        } else if (promedio >= 4.0) {
	            return "RI"; // Reprobados por inasistencia
	        } else if (asistencia >= asistenciaMinima) {
	            return "RN"; // Reprobados por notas
	        } else {
	            return "RR"; // Reprobados por ambas
	        }
	    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [");
		builder.append("Rut : ");
		builder.append(getRun());
		builder.append(", Nombre: ");
		builder.append(getNombre());
		builder.append(", Fecha de Nacimiento: ");
		builder.append(formato.format(calendario.getTime()));
		builder.append(", Asistencia: ");
		builder.append(asistencia);
		builder.append(", promedio: ");
		builder.append(promedio);
		builder.append("]");
		return builder.toString();
	}
	 
	 

}
