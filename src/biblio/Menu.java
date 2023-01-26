package biblio;

public class Menu {
	public static void mostrarMenuPrincipal() {
		System.out.println("Menu principal");
		System.out.println("1. Gestionar Libros");
		System.out.println("2. Gestionar Socios");
		System.out.println("3. Gestionar Prestamos");
	}
	public static void mostrarMenuLibros() {
		System.out.println("Menu libros");
		System.out.println("1. Insertar libro");
		System.out.println("2. Eliminar libro");
		System.out.println("3. Ver libros");
	}
	public static void mostrarMenuSocios() {
		System.out.println("Menu socios");
		System.out.println("1. Ver socios");
	}
	public static void mostrarMenuPrestamos() {
		System.out.println("Menu prestamos");
		System.out.println("1. Realizar prestamo");
	}
}
