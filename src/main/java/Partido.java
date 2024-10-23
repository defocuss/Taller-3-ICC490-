import java.util.ArrayList;
import java.util.Date;

public class Partido {
	private Date fechaPartido;
	private ArrayList<Equipo> equiposAJugar;
	private Cancha cancha;


	public Partido(Date fechaPartido, Cancha cancha) {
		this.fechaPartido = fechaPartido;
		this.equiposAJugar = equiposAJugar;
		this.cancha = cancha;
	}

	public Date getFechaPartido() {
		return this.fechaPartido;
	}

	public void setFechaPartido(Date fechaPartido) {
		this.fechaPartido = fechaPartido;
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

	public void asociarCancha(Cancha cancha) {
		this.cancha = cancha;
	}
}