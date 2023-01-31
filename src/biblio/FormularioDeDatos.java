package biblio;

import java.util.Scanner;

public class FormularioDeDatos {
	public static Libro pedirDatosLibro(Scanner scan) {
		Libro libro = new Libro();
		
		System.out.println("Introduce el titulo");
		libro.setTitulo(scan.nextLine());
		
		System.out.println("Introduce el autor");
		libro.setAutor(scan.nextLine());
		
		System.out.println("Introduce el numero de paginas");
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		return libro;
	}
	
	public static Libro modificarDatosLibro(Libro libro, Scanner scan) {
		System.out.println("Introduce el titulo nuevo");
		libro.setTitulo(scan.nextLine());
		
		System.out.println("Introduce el autor nuevo");
		libro.setAutor(scan.nextLine());
		
		System.out.println("Introduce el nuevo numero de paginas");
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		return libro;
	}
	
	public static int pedirIdLibro(Scanner scan) {
		int id;
		
		System.out.println("Introduce el id del libro");
		id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
}