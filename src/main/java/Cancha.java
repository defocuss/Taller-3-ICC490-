import java.util.ArrayList;

public class Cancha {
	private String superficie;
	private String ubicacion;
	private int capacidadEspectadores;
	private ArrayList<Partido> partidos;

	public Cancha(String superficie, String ubicacion, int capacidadEspectadores) {
		this.superficie = superficie;
		this.ubicacion = ubicacion;
		this.capacidadEspectadores = capacidadEspectadores;
		this.partidos = partidos;
	}

	public String getSuperficie() {
		return this.superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public boolean agregarPartido(Partido partido) {}

	public boolean VerificarPartido(Partido partido) {
		if (partido)
	}
}