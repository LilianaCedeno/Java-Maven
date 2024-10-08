package clases;
import java.util.InputMismatchException;
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
		
		  while (true) { // Usamos un bucle para seguir pidiendo la nota
	            System.out.print("Ingrese la nota (0,1 al 7,0): ");
	            try {
	                Double auxN = leer.nextDouble(); // Intentar leer la nota

	                if (validarNota(auxN)) {
	                    nota = auxN; // Asigna la nota si es válida
	                    break; // aca para salir  del bucle
	                } else {
	                    System.out.println("Nota en formato incorrecto. Debe estar entre 0,1 y 7,0. Inténtelo nuevamente.");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Entrada no válida. Por favor, ingrese un número decimal.");
	                leer.next(); 
	            }
	        }
		
	}

	public Boolean validarNota(Double n) {
			
		if (n >=0.1 && n<= 7) {
			return true;

		}else{
			System.out.println("Las notas deben ser del 0,1 al 7,0");
			return false;
		}
		
	}
	
	
	
}
