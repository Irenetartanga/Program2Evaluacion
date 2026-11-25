package reinoMedieval;

public class Mago extends Personaje{
	private int hechizos;
	private Ataque ataque;

	public Mago(String nombre, int nivel, int puntosVida, int hechizos, Ataque ataque) {
		super(nombre, nivel, puntosVida);
		this.hechizos = hechizos;
		this.ataque = ataque;
	}

	public void meditar(int cantidad) {
		hechizos +=cantidad;
	}

	@Override
	public void play() {
		if (this.hechizos>= 10) {
			this.hechizos-=1;
			System.out.println(this.ataque);
		} else {
			System.out.println("No tienes hechizos y tienes que meditarpara recuperarlos");
		}

	}
	@Override
	public void presentarse() {
		super.presentarse();
		System.out.println("Mago [hechizos=" + hechizos + ", ataque=" + ataque + "]");
	}

	@Override
	public String toString() {
		return "Mago [hechizos=" + hechizos + ", ataque=" + ataque + "]";
	}

}
