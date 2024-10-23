public class Entrenador {

	private String nombre;
	private String experiencia;
	private String deporteEspecializacion;

	public Entrenador(String nombre, String experiencia, String deporteEspecializacion) {
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.deporteEspecializacion = deporteEspecializacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getDeporteEspecializacion() {
		return this.deporteEspecializacion;
	}

	public void setDeporteEspecializacion(String deporteEspecializacion) {
		this.deporteEspecializacion = deporteEspecializacion;
	}
}