public class Deportista {

	private String nombre;
	private String apellido;
	private int contacto;
	private String deportePracticar;

	public Deportista(String nombre, String apellido, String deportePracticar, int contacto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.deportePracticar = deportePracticar;
		this.contacto = contacto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getContacto() {
		return this.contacto;
	}

	public void setContacto(int contacto) {
		this.contacto = contacto;
	}

	public String getDeportePracticar() {
		return this.deportePracticar;
	}

	public void setDeportePracticar(String deportePracticar) {
		this.deportePracticar = deportePracticar;
	}
}