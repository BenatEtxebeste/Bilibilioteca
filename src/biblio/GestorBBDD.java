package biblio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
}
