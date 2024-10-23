import java.util.ArrayList;

public class Equipo {

	private String nombre;
	private String deporte;
	private ArrayList<Partido> partidos;
	private Entrenador entrenador;
	private ArrayList<Deportista> deportistas;

	public Equipo(String nombre, String deporte, Entrenador entrenador) {
		this.nombre = nombre;
		this.deporte = deporte;
		this.partidos = partidos;
		this.entrenador = entrenador;
		this.deportistas = deportistas;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDeporte() {
		return this.deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public ArrayList<Partido> getPartidos() {
		throw new UnsupportedOperationException();
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		throw new UnsupportedOperationException();
	}

	public Entrenador getEntrenador() {
		return this.entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public ArrayList<Deportista> getDeportistas() {
		throw new UnsupportedOperationException();
	}

	public void setDeportistas(ArrayList<Deportista> deportistas) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarDeportista(Deportista deportista) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarEntrenador(Entrenador entrenador) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarPartido(Partido partido) {
		throw new UnsupportedOperationException();
	}
}