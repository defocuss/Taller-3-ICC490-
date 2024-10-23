import java.util.ArrayList;
import java.util.Date;

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

	public boolean agregarPartido(Partido partido) {
		if (verificarPartido(partido.getFechaPartido(), partido.getCancha())){
			partidos.add(partido);
			return true;
		}
		return false;
	}

	public boolean verificarPartido(Date horario, Cancha cancha) {
		for (Partido partido : partidos){
			if (partido.getFechaPartido().equals(horario) && partido.getCancha().equals(cancha)){
				return false;
			}
		}
		return true;
	}
}