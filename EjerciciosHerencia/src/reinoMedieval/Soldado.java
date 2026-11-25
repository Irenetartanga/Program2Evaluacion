package reinoMedieval;

public class Soldado extends Personaje{
	private String arma;
	public Soldado(String nombre, int nivel, int puntosVida, String arma, int armadura) {
		super(nombre, nivel, puntosVida);
		this.arma = arma;
		this.armadura = armadura;
	}

	private int armadura=0;

	public void play() {
		if (this.arma=="Espada Larga") {
			System.out.println("Daño infligido con la Espada Larga 6");
		}
		if (this.arma=="Lanza") {
			System.out.println("Daño infligido con la Lanza 5");
		}
		else {
			System.out.println("No tienes arma, no hces daño");
		}
	}

	public void recibirDanio() {

	}
}
