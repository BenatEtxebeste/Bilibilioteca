package biblio;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {

public static void run(Scanner scan) throws SQLException {
		
		int opcion;
		Socio socio = new Socio();
		GestorBBDD gestorBBDD = new GestorBBDD();
		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_SOCIO:
				
				socio = FormularioDeDatos.pedirDatosSocio(scan);
				gestorBBDD.insertarSocio(socio);
				
				break;
			case Menu.ELIMINAR_SOCIO:
				
				gestorBBDD.eliminarSocio(FormularioDeDatos.pedirIdSocio(scan));
				
				break;
			case Menu.MODIFICAR_SOCIO:
				
				socio = gestorBBDD.getSocio(FormularioDeDatos.pedirIdSocio(scan));
				FormularioDeDatos.modificarDatosSocio(socio, scan);
				gestorBBDD.modificarSocio(socio);
				
				break;
			case Menu.VER_SOCIOS:
				
				Visor.mostrarSocios(gestorBBDD.getSocios());
				
				break;
			case Menu.SALIR:
				System.out.println("Volviendo al gestor de biblioteca");
				break;
			}
		}while (opcion != Menu.SALIR);
	}
}
