package biblio;

import java.sql.Date;

public class Prestamo {
	private Date fecha;
	private boolean devuelto;
	
	public Prestamo() {
	}

	public Prestamo(Date fecha, boolean devuelto) {
		this.fecha = fecha;
		this.devuelto = devuelto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isDevuelto() {
		return devuelto;
	}

	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
}