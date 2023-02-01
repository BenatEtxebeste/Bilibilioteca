package biblio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorBBDD extends Conector{
	PreparedStatement pst;
	
	public void insertarLibro(Libro libro) throws SQLException {
		super.conectar();
		pst = con.prepareStatement("INSERT INTO libros VALUES (null, ?, ?, ?)");
		pst.setString(1, libro.getTitulo());
		pst.setString(2, libro.getAutor());
		pst.setInt(3, libro.getNum_pag());
		
		pst.execute();
		super.cerrar();
	}
	
	public void eliminarLibro(int id) throws SQLException {
		super.conectar();
		pst = con.prepareStatement("DELETE FROM libros WHERE id = ?");
		pst.setInt(1, id);
	}
	
	public Libro getLibro(int id) throws SQLException {
		super.conectar();
		String sentenciaSelect = "SELECT * FROM libros WHERE id = ?";
		pst.setInt(1, id);
		Libro libro = new Libro();
		ResultSet resultado = pst.executeQuery(sentenciaSelect);
		libro.setId(resultado.getInt("id"));
		libro.setTitulo(resultado.getString("titulo"));
		libro.setAutor(resultado.getString("autor"));
		libro.setNum_pag(resultado.getInt("num_pag"));
		
		return libro;
	}
	
	public ArrayList<Libro> getLibros() throws SQLException {
		super.conectar();
		ArrayList<Libro> libros = new ArrayList<Libro>();
		String sentenciaSelect = "SELECT * FROM libros";
		ResultSet resultado = pst.executeQuery(sentenciaSelect);
		while (resultado.next()) {
			System.out.println(resultado.getInt(1) + ". " + resultado.getString(2));
		}
		return libros;
	}
	
	public void modificarLibro(Libro libro) throws SQLException {
		super.conectar();
		pst = con.prepareStatement("UPDATE libros set titulo = ?, autor = ?, num_pag = ? WHERE id = ?");
		pst.setString(1, libro.getTitulo());
		pst.setString(2, libro.getAutor());
		pst.setInt(3, libro.getNum_pag());
		pst.setInt(4, libro.getId());
		
		pst.execute();
	}
	
}
