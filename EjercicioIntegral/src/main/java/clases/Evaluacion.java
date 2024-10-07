package clases;
import java.util.Scanner;

public class Evaluacion {
	
	protected Double nota;
	Scanner leer;
	
	public Evaluacion() {
		leer = new Scanner(System.in);
		setNota();
		
		
	}

	public Double getNota() {
		return nota;
	}

	public void setNota() {
	
		System.out.println("Ingrese la nota");
		Double auxN = leer.nextDouble();
		
		if (validarNota(auxN)){
			nota = auxN;
			} else {
				System.out.println("Nota en formato incorrecto");
				setNota();
			}
		}

	public Boolean validarNota(Double n) {
		Boolean valido = false;
		
		if (nota >=0.1 && nota<= 7) {
			valido = true;

		}else{
			System.out.println("Las notas deben ser del 0.1 al 7.0");
		}
		return valido;
		
	}
	
}
