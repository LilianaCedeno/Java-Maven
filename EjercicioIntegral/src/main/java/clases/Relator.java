package clases;
import interfaz.IProyecto;

public class Relator extends Persona implements IProyecto {
	
	protected String profesion;
	protected Double sueldo;
	
	
	public Relator() {
		super();
		setProfesion();
		setSueldo();
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion() {
		System.out.println("Ingrese la Profesión.");
		profesion = leer.nextLine();
	}


	public Double getSueldo() {
		return sueldo;
	}


	public void setSueldo() {
		System.out.println("Ingrese el sueldo.");
		sueldo = leer.nextDouble();
		leer.nextLine();
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Relator [");
		builder.append("Rut: ");
		builder.append(getRun());
		builder.append(", Nombre: ");
		builder.append(getNombre());
		builder.append(", Fecha Nacimiento: ");
		builder.append(formato.format(calendario.getTime()));
		builder.append(", profesion: ");
		builder.append(profesion);
		builder.append(", sueldo: ");
		builder.append(sueldo);
		
		builder.append("]");
		return builder.toString();
	}


	
	

}
