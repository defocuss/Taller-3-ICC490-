public class ClubDeportivo {
	private String nombreClub;
	private ArrayList<Equipo> equipos;
	private ArrayList<Cancha> canchas;

	public String getNombreClub() {
		return this.nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	public ArrayList<Equipo> getEquipos() {
		throw new UnsupportedOperationException();
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		throw new UnsupportedOperationException();
	}

	public void agregarEquipo(Equipo equipo) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Cancha> getCanchas() {
		throw new UnsupportedOperationException();
	}

	public void setCanchas(ArrayList<Cancha> canchas) {
		throw new UnsupportedOperationException();
	}
}