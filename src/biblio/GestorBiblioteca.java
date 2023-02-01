package biblio;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorBiblioteca {
	Scanner scan = new Scanner(System.in);
	
	public void run() throws SQLException {
		int opcion;
		do {
			Menu.mostrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);
				break;
			case Menu.GESTIONAR_SOCIOS:
				GestorSocios.run(scan);
				break;
			case Menu.GESTIONAR_PRESTAMOS:
				System.out.println("Aquí iria el gestor de prestamos");
				break;
			case Menu.SALIR:
				System.out.println("Volviendo al menu principal");
			}
		}while (opcion != Menu.SALIR);
	}
}