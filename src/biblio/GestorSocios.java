package biblio;

import java.util.Scanner;

public class GestorSocios {

public static void run(Scanner scan) {
		
		int opcion;
		Socio socio = new Socio();
		GestorBBDD gestorBBDD = new GestorBBDD();
		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_SOCIO:
				break;
			case Menu.ELIMINAR_SOCIO:
				break;
			case Menu.MODIFICAR_SOCIO:
				break;
			case Menu.VER_SOCIOS:
				break;
			case Menu.SALIR:
				System.out.println("Volviendo al gestor de biblioteca");
				break;
			}
		}while (opcion != Menu.SALIR);
	}
}
