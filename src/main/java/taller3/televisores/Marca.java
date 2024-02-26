package taller3.televisores;

public class Marca {
	private String nombre;
	
	//CONSTRUCTOR
	public Marca(String nombre) {
		this.nombre= nombre;	
	}
	
	//METODO SET
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	//METODO GET
	public String getNombre() {
		return nombre;	
	}
}
