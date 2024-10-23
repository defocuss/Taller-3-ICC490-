import java.util.ArrayList;
import java.util.Date;

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
		if (veridicarDeportista(deportista.getNombre(),deportista.getApellido()) == null){
			this.deportistas.add(deportista);
			return true;
		}
		return false;
	}

	public Deportista veridicarDeportista(String nombre, String apellido){
		for (Deportista deportista : deportistas) {
			if(deportista.getNombre().equals(nombre) && deportista.getApellido().equals(apellido)){
				return deportista;
			}
		}
		return null;
	}

	public void agregarEntrenador(Entrenador entrenador) {
		setEntrenador(entrenador);
	}

	public void agregarPartido(Partido partido) {
			this.partidos.add(partido);
	}

}