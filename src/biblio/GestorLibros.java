package biblio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorLibros {
	
	public static void run(Scanner scan) throws SQLException {
		
		int opcion;
		Libro libro = new Libro();
		GestorBBDD gestorBBDD = new GestorBBDD();
		do {
			Menu.mostrarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				
				libro = FormularioDeDatos.pedirDatosLibro(scan);
				gestorBBDD.insertarLibro(libro);
				
				break;
			case Menu.ELIMINAR_LIBRO:
				
				gestorBBDD.eliminarLibro(FormularioDeDatos.pedirIdLibro(scan));
				
				break;
			case Menu.MODIFICAR_LIBRO:
				
				libro = gestorBBDD.getLibro(FormularioDeDatos.pedirIdLibro(scan));
				FormularioDeDatos.modificarDatosLibro(libro, scan);
				gestorBBDD.modificarLibro(libro);
				
				break;
			case Menu.VER_LIBROS:
				
				
				
				break;
			case Menu.SALIR:
				System.out.println("Volviendo al gestor de biblioteca");
				break;
			}
		}while (opcion != Menu.SALIR);
	}
}
