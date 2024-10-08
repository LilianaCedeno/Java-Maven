package main;

import java.util.*;

import clases.CursoIntensivo;
import clases.Relator;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArrayList<CursoIntensivo> cursos = new ArrayList<CursoIntensivo>();
        int option;
 
        do {
            System.out.println("CURSOS INTENSIVOS");
            System.out.println("-------------------------");
            System.out.println("1) Ingresar un nuevo curso intensivo.");
            System.out.println("2) Mostrar todos los relatores con sus sueldos.");
            System.out.println("3) Mostrar la S.F. de cada alumno de un curso intensivo especifico.");
            System.out.println("4) Buscar un alumno por run en un curso intensivo espeficico.");
            System.out.println("5) Eliminar un alumno por run en un  curso  intensivo especifico.");
            System.out.println("6) Exportar toda la informacion a un fichero.");
            System.out.println("7) Salir.");
            System.out.print("Seleccione una opción: ");
            option = leer.nextInt();
            leer.nextLine();
 
            switch (option) { 
                case 1:
                	System.out.println("-------------------------------------");
                    System.out.println(" Ingresando un nuevo Curso Intensivo.");
                	System.out.println("-------------------------------------");
                	CursoIntensivo c = new CursoIntensivo();
                	cursos.add(c);
                	break;   
                case 2:
                    System.out.println("\u001B[32m"+"Mostrando datos de los Relator"+"\u001B[0m");
                    System.out.println("\u001B[32m"+"------------------------------"+"\u001B[0m");
                    for (CursoIntensivo cursoIntensivo : cursos) {
                        Relator relator = cursoIntensivo.getRelator();
                        System.out.println(relator);
                    }
                    break; 
                case 3:
                	System.out.println("\u001B[32m"+"Mostrando situacion de cada alumno por curso Especifico"+"\u001B[0m");
                    System.out.println("\u001B[32m"+"-------------------------------------------------------"+"\u001B[0m");
                    System.out.println("\u001B[32m" + "    --------------------------------------------" + "\u001B[0m");
                    System.out.print("Ingrese el código del curso: ");
                    String codigoCurso = leer.nextLine();
                    boolean validaC = false;
                    for (CursoIntensivo cursoIntensivo : cursos) {
                        if (cursoIntensivo.getCodigo().equals(codigoCurso)) {
                            cursoIntensivo.mostrarSF(codigoCurso);
                            validaC = true;
                            break;
                        }
                    }
                    if (!validaC) {
                        System.out.println("Curso no encontrado.");
                    }
                    break;
                    
                    
                case 4:
                	 System.out.println("\u001B[32m" + "Buscar alumno por RUT" + "\u001B[0m");
                     System.out.println("\u001B[32m" + "------------------------------" + "\u001B[0m");
                     System.out.print("Ingrese el código del curso: ");
                     String codigoBuscar = leer.nextLine();
                     boolean validaB = false;
                     for (CursoIntensivo cursoIntensivo : cursos) {
                         if (cursoIntensivo.getCodigo().equals(codigoBuscar)) {
                             cursoIntensivo.buscarAlumno(); // Buscar alumno en el curso
                             validaB = true;
                             break;
                         }
                     }
                     if (!validaB) {
                         System.out.println("Curso no encontrado.");
                     }
                    
                    break;
                    
                    
                case 5:
                	  System.out.println("\u001B[32m" + "Eliminar alumno por RUT" + "\u001B[0m");
                      System.out.println("\u001B[32m" + "------------------------------" + "\u001B[0m");
                      System.out.print("Ingrese el código del curso: ");
                      String codigoEliminar = leer.nextLine();
                      boolean validaE = false;
                      for (CursoIntensivo cursoIntensivo : cursos) {
                          if (cursoIntensivo.getCodigo().equals(codigoEliminar)) {
                              cursoIntensivo.eliminarAlumno(); 
                              validaE = true;
                              break;
                          }
                      }
                      if (!validaE) {
                          System.out.println("Curso no encontrado.");
                      }
                    break;
                    
                    
                case 6:/*
                    System.out.println("\u001B[32m" + "Exportando datos a un fichero..." + "\u001B[0m");
                    System.out.println("\u001B[32m"+"------------------------"+"\u001B[0m");
                    
                    System.out.print("Ingrese el nombre del fichero (sin extensión): ");
                    String nombreFichero = leer.nextLine();
                    System.out.print("Seleccione el formato (1: Excel, 2: PDF): ");
                   
                    int formato = leer.nextInt();
                    if (formato == 1) {
                        cursos.forEach(curso -> curso.exportarDatos(nombreFichero));
                    } else if (formato == 2) {
                        pdf)
                    }*/
                	break;
                	                    
                    
                case 7:
                    System.out.println("Saliendo...");
                    break;
                    
                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 7);
        leer.close();
		

	}

}
