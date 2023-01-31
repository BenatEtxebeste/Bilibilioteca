package biblio;

public class GestorLibros {
	
	public static void run(Scanner scan) {
		
		int opcion;
		GestorBBDD gestorBBDD = new GestorBBDD();
		do {
			Menu.mostrarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				System.out.println("ins libro");
			}
		}while (opcion != 5);
	}
}
