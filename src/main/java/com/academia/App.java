package com.academia;

import com.academia.dao.AlumnoDAO;
import com.academia.model.Alumno;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        AlumnoDAO alumnoDAO = new AlumnoDAO();

        while (true) {
            System.out.println("\n--- Gestión de Alumnos ---");
            System.out.println("1. Añadir un nuevo alumno");
            System.out.println("2. Consultar un alumno por ID");
            System.out.println("3. Actualizar un alumno");
            System.out.println("4. Eliminar un alumno");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Número de asignaturas: ");
                    int numAsignaturas = scanner.nextInt();

                    Alumno alumno = new Alumno();
                    alumno.setNombre(nombre);
                    alumno.setApellidos(apellidos);
                    alumno.setCurso(curso);
                    alumno.setEdad(edad);
                    alumno.setNumAsignaturas(numAsignaturas);

                    alumnoDAO.saveAlumno(alumno);
                    System.out.println("Alumno guardado correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el ID del alumno: ");
                    int idConsulta = scanner.nextInt();
                    Alumno alumnoConsultado = alumnoDAO.getAlumnoById(idConsulta);
                    if (alumnoConsultado != null) {
                        System.out.println("Alumno encontrado: " + alumnoConsultado);
                    } else {
                        System.out.println("No se encontró ningún alumno con ese ID.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el ID del alumno a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    Alumno alumnoActualizar = alumnoDAO.getAlumnoById(idActualizar);
                    if (alumnoActualizar != null) {
                        System.out.print("Nuevo nombre: ");
                        alumnoActualizar.setNombre(scanner.nextLine());
                        System.out.print("Nuevos apellidos: ");
                        alumnoActualizar.setApellidos(scanner.nextLine());
                        System.out.print("Nuevo curso: ");
                        alumnoActualizar.setCurso(scanner.nextLine());
                        System.out.print("Nueva edad: ");
                        alumnoActualizar.setEdad(scanner.nextInt());
                        System.out.print("Nuevo número de asignaturas: ");
                        alumnoActualizar.setNumAsignaturas(scanner.nextInt());

                        alumnoDAO.updateAlumno(alumnoActualizar);
                        System.out.println("Alumno actualizado correctamente.");
                    } else {
                        System.out.println("No se encontró ningún alumno con ese ID.");
                    }
                    break;

                case 4:

                    System.out.print("Ingrese el ID del alumno a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    alumnoDAO.deleteAlumno(idEliminar);
                    System.out.println("Alumno eliminado correctamente.");
                    break;

                case 5:

                    System.out.println("Saliendo del programa. Hasta otra.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
