import java.util.ArrayList;

public class ClubDeportivo {
	private String nombreClub;
	private ArrayList<Equipo> equipos;
	private ArrayList<Cancha> canchas;

	public ClubDeportivo(String nombreClub) {
		this.nombreClub = nombreClub;
		this.equipos = equipos;
		this.canchas = canchas;
	}

	public String getNombreClub() {
		return this.nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	public ArrayList<Equipo> getEquipos() {
		throw new UnsupportedOperationException();
	}

	public boolean agregarEquipo(Equipo equipo) {
		if (buscarEquipo(equipo.getNombre()) == null) {
			this.equipos.add(equipo);
			return true;
		}
		return false;
	}

	public Equipo buscarEquipo(String nombreEquipo) {
		for (Equipo equipo : equipos) {
			if (equipo.getNombre().equals(nombreEquipo)) {
				return equipo;
			}
		}
		return null;
	}

	public void agregarCancha(Cancha cancha) {
		this.canchas.add(cancha);
	}

}