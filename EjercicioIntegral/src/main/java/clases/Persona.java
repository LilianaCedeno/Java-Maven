package clases;


import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import interfaz.IProyecto;

public class Persona implements IProyecto {
	private String run, nombre;
	private Date fechaNacimiento;
	protected Calendar calendario;
	protected SimpleDateFormat formato;
	
	public Persona() {
		
		formato = new SimpleDateFormat("dd/MM/yyyy");
		calendario = Calendar.getInstance();
		
		setRun();
		setNombre();
		setFechaNacimiento();
		
	}

	public String getRun() {
		return run;
	}

	public void setRun() {
		System.out.println("Ingrese su Run. ");
		run = leer.nextLine();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre() {
		System.out.println("Ingrese su Nombre. ");
		nombre = leer.nextLine();
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento() {
		try {
            System.out.println("Ingrese la fecha de Nacimiento(FORMATO - 01/01/2024):");
            String fechaStr = leer.nextLine();
            fechaNacimiento = formato.parse(fechaStr);
            calendario.setTime(fechaNacimiento);
        } catch (ParseException e) {
            System.err.println("Error: " + e.getMessage() + ". Por favor, use el formato 01/01/2024");
        }
		
	}
	
}
