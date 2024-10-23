public class Partido {
	private Date fechaPartido;
	private ArrayList<Equipo> equiposAJugar;
	private Cancha cancha;
	private Equipo equipo;

	public Date getFechaPartido() {
		return this.fechaPartido;
	}

	public void setFechaPartido(Date fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object attribute) {
		throw new UnsupportedOperationException();
	}

	public Cancha getCancha() {
		return this.cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public boolean verificacionCanchaDisponible() {
		throw new UnsupportedOperationException();
	}
}