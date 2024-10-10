package clases;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Principal;
import java.util.*;
/*
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/

import interfaz.IProyecto;

public class CursoIntensivo implements IProyecto{
	
	protected String codigo;
	protected String nombre;	
	protected Integer asistenciaMinima;
	protected Relator relator;
	protected ArrayList<Persona> listaCurso;
	protected Map<String, List<Alumno>> cursos; 

	
	public CursoIntensivo() {
		listaCurso = new ArrayList<>();
		setCodigo();
		setNombre();
		setAsistenciaMinima();
		setRelator();
		setListaCurso();
		cursos = new HashMap<>();
		
		cursos.put(codigo, obtenerAlumnos()); 
	
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


	public void setNombre() {
		System.out.println("Ingrese el nombre del Curso: ");
		nombre= leer.nextLine();
	}


	public Integer getAsistenciaMinima() {
		return asistenciaMinima;
	}


	public void setAsistenciaMinima() {
		System.out.println("Ingrese Asistencia Minima: ");
		asistenciaMinima= leer.nextInt();
		leer.nextLine();

	}


	public Relator getRelator() {
		return relator;
	}


	public void setRelator() {
		System.out.println("\u001B[32m"+"------------------------------"+"\u001B[0m");
        System.out.println("\u001B[32m"+"Ingresando datos del Relator"+"\u001B[0m");
        System.out.println("\u001B[32m"+"------------------------------"+"\u001B[0m");
		relator = new Relator();
	}


	public ArrayList<Persona> getListaCurso() {
		return listaCurso;
	}


	public void setListaCurso() {
		String respuesta;
	    
	    do {
	        System.out.println("\u001B[32m" + "------------------------------" + "\u001B[0m");
	        System.out.println("\u001B[32m" + "Ingresando datos del Alumno" + "\u001B[0m");
	        System.out.println("\u001B[32m" + "------------------------------" + "\u001B[0m");
	        
	        Alumno a = new Alumno();
	        listaCurso.add(a);
	        
	        System.out.print("¿Desea agregar otro alumno? (si - no): ");
	        respuesta = leer.nextLine();
	    } while (respuesta.equalsIgnoreCase("si")); 
	}
	
	
	public void buscarAlumno(){
        
		System.out.println("Ingrese el Rut del Alumno: ");
		String runB = leer.nextLine();
		
		Optional<Persona> curso = listaCurso.stream()
				.filter(v -> v.getRun().equals(runB))
				.findFirst();
        
        if (curso.isPresent()) {
            System.out.println("Alumno encontrado: ");
            System.out.println(curso.get().toString());
        } else {
            
               System.out.println("Alumno no encontrado");
            }

		
    }
	
    public void eliminarAlumno(){
    	
    	System.out.println("Ingrese el Rut del Alumno: ");
		String runB = leer.nextLine();
		
		Optional<Persona> curso = listaCurso.stream()
				.filter(v -> v.getRun().equals(runB))
				.findFirst();
        
        if (curso.isPresent()) {
        	 System.out.println("Alumno encontrado: ");
             System.out.println(curso.get().toString()); // Muestra los detalles del alumno
             listaCurso.remove(curso.get());
             System.out.println("Alumno eliminado.");
            
        } else {
            
               System.out.println("Alumno no encontrado");
            }
    	
    	
    }
    
    private List<Alumno> obtenerAlumnos() {
    	
        List<Alumno> alumnos = new ArrayList<>();
        
        for (Persona persona : listaCurso) {
            if (persona instanceof Alumno) {
                alumnos.add((Alumno) persona);
            }
        }
        return alumnos;
    }
    
    public void mostrarSF(String codigoCurso) {
    	
        if (cursos.containsKey(codigoCurso)) {
        	List<Alumno> alumnosCurso = cursos.get(codigoCurso);
        	
            System.out.println("Situación Final de los alumnos en el curso " + codigoCurso + ":");
            
            for (Alumno alumno : alumnosCurso) {
                String situacion = alumno.calcularSituacionFinal(alumno.getAsistencia());
                System.out.println("Alumno: " + alumno.getNombre() + " - Situación Final: " + situacion);
            }
        } else {
            System.out.println("El curso con código " + codigoCurso + " no se encontró.");
        }
    }
}
    
