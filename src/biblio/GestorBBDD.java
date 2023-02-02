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
			Libro libro = new Libro();
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			libro.setAutor(resultado.getString("autor"));
			libro.setNum_pag(resultado.getInt("num_pag"));
			libros.add(libro);
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
	
	public void insertarSocio(Socio socio) throws SQLException {
		super.conectar();
		pst = con.prepareStatement("INSERT INTO socios VALUES (null, ?, ?, ?, ?, ?, ?)");
		pst.setString(1, socio.getNombre());
		pst.setString(2, socio.getApellido());
		pst.setString(3, socio.getDireccion());
		pst.setString(4, socio.getPoblacion());
		pst.setString(5, socio.getProvincia());
		pst.setString(6, socio.getDni());
		
		pst.execute();
		super.cerrar();
	}
	
	public void eliminarSocio(int id) throws SQLException {
		super.conectar();
		pst = con.prepareStatement("DELETE FROM socios WHERE id = ?");
		pst.setInt(1, id);
	}
	
	public Socio getSocio(int id) throws SQLException {
		super.conectar();
		String sentenciaSelect = "SELECT * FROM socios WHERE id = ?";
		pst.setInt(1, id);
		Socio socio = new Socio();
		ResultSet resultado = pst.executeQuery(sentenciaSelect);
		socio.setId(resultado.getInt("id"));
		socio.setNombre(resultado.getString("nombre"));
		socio.setApellido(resultado.getString("apellido"));
		socio.setDireccion(resultado.getString("direccion"));
		socio.setPoblacion(resultado.getString("poblacion"));
		socio.setProvincia(resultado.getString("provincia"));
		socio.setDni(resultado.getString("dni"));
		
		return socio;
	}
	
	public ArrayList<Socio> getSocios() throws SQLException {
		super.conectar();
		ArrayList<Socio> socios = new ArrayList<Socio>();
		String sentenciaSelect = "SELECT * FROM libros";
		ResultSet resultado = pst.executeQuery(sentenciaSelect);
		while (resultado.next()) {
			Socio socio = new Socio();
			socio.setNombre(resultado.getString("nombre"));
			socio.setApellido(resultado.getString("apellido"));
			socio.setDireccion(resultado.getString("direccion"));
			socio.setPoblacion(resultado.getString("poblacion"));
			socio.setProvincia(resultado.getString("provincia"));
			socio.setDni(resultado.getString("dni"));
			socios.add(socio);
		}
		return socios;
	}
	
	public void modificarSocio(Socio socio) throws SQLException {
		super.conectar();
		pst = con.prepareStatement("UPDATE socios set nombre = ?, apellido = ?, direccion = ?, poblacion = ?, provincia = ?, dni = ? WHERE id = ?");
		pst.setString(1, socio.getNombre());
		pst.setString(2, socio.getApellido());
		pst.setString(3, socio.getDireccion());
		pst.setString(4, socio.getPoblacion());
		pst.setString(5, socio.getProvincia());
		pst.setString(6, socio.getDni());
		pst.setInt(7, socio.getId());
		
		pst.execute();
	}
}
