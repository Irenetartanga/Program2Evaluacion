package reinoMedieval;

public class Personaje {
	public Personaje(String nombre, int nivel, int puntosVida) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntosVida = puntosVida;
		numeroDePersonajes++;
	}
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", puntosVida=" + puntosVida + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	private String nombre; // este nombre es el this.nombre
	private int nivel=0; // este nivel es el this.nivel
	private int puntosVida=0; // este puntosVida es el this.puntosVida
	private static int numeroDePersonajes=0; // para incrementar el numero de personajes


	public void presentarse() {
		System.out.println("Personaje [nombre=" + nombre + ", nivel=" + nivel + ", puntosVida=" + puntosVida + "]"); 
	}
	public void play() {

	}

	public void recibirDanio(int cantidad) {
		setPuntosVida(puntosVida-cantidad);
	}
}
