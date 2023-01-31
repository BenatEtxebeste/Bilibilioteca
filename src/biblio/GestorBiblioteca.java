package biblio;

import java.util.Scanner;

public class GestorBiblioteca {
	Scanner scan = new Scanner(System.in);
	
	public void run() {
		int opcion;
		do {
			Menu.mostrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);
				break;
			case Menu.GESTIONAR_SOCIOS
			}
		}while (Menu);
	}
}