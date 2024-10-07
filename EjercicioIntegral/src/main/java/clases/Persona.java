package clases;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import interfaz.IProyecto;

public class Persona implements IProyecto {
	protected String run, nombre;
	protected Date fechaNacimiento;
	private Calendar calendario;
	private SimpleDateFormat formato;
	
	public Persona() {
		
		formato = new SimpleDateFormat("dd/mm/yyyy");
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
			System.out.println(" Ingrese la fecha de Nacimiento ::: FORMATO - 01/01/2024)");
			fechaNacimiento = (Date) formato.parse(leer.nextLine());
			calendario.setTime(fechaNacimiento);
		}catch(ParseException e) {
			System.err.println("error: " + e.getMessage()+ " por favor use el formato 01/01/2024");
			
		}
	}
	
}
