public class Cancha {
	private String superficie;
	private String ubicacion;
	private int capacidadEspectadores;
	private ArrayList<Partido> partidos;

	public String getSuperficie() {
		return this.superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidadEspectadores() {
		return this.capacidadEspectadores;
	}

	public void setCapacidadEspectadores(int capacidadEspectadores) {
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public ArrayList<Partido> getPartidos() {
		throw new UnsupportedOperationException();
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		throw new UnsupportedOperationException();
	}
}