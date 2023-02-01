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
		System.out.println("Introduce el id del libro");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
	
	public static Socio pedirDatosSocio(Scanner scan) {
		Socio socio = new Socio();
		
		System.out.println("Introduce el nombre");
		socio.setNombre(scan.nextLine());
		
		System.out.println("Introduce el apellido");
		socio.setApellido(scan.nextLine());
		
		System.out.println("Introduce la direccion");
		socio.setDireccion(scan.nextLine());
		
		System.out.println("Introduce la poblacion");
		socio.setPoblacion(scan.nextLine());
		
		System.out.println("Introduce la provincia");
		socio.setProvincia(scan.nextLine());
		
		System.out.println("Introduce el dni");
		socio.setDni(scan.nextLine());
	}
}