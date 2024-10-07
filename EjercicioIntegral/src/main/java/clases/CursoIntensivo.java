package clases;

import java.util.ArrayList;
import java.util.Optional;

import interfaz.IProyecto;

public class CursoIntensivo implements IProyecto{
	
	protected String codigo;
	protected String nombre;
	protected Relator relator;
	protected Integer asistenciaMinima;
	protected ArrayList<Persona> listaCurso;

	
	public CursoIntesivo() {
		setCodigo();
		setNombre();
	
	
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo() {
		System.out.println("Ingrese el Código del Curso: ");
		codigo= leer.nextLine();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre( ) {
		System.out.println("Ingrese el nombre del Curso: ");
		nombre= leer.nextLine();
	}

	public Integer getAsistenciaMinima() {
		return asistenciaMinima;
	}


	public void setAsistenciaMinima() {
		System.out.println("Ingrese Asistencia Minima: ");
		asistenciaMinima= leer.nextInt();
	}

	public ArrayList<Persona> getlistaCurso() {
		return listaCurso;
	}

	public void setlistaCurso() {
		Persona curso= new Persona();
		listaCurso.add(curso);
	}
	
	public void getBuscarAlumno() {
		System.out.println("Ingrese el Rut del Alumno: ");
		String runB = leer.nextLine();
		
		Optional<Persona> curso = listaCurso.stream().filter(v -> v.getRun().equals(runB)).findFirst();
        
        if (curso.isPresent()) {
            System.out.println("Alumno encontrado: " + curso.get());
        } else {
            
               System.out.println("Alumno no encontrado");
            }
		
        }
	}
