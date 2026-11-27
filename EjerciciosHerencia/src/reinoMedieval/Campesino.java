package reinoMedieval;

public class Campesino extends Personaje{
	public Campesino(String nombre, int nivel, int puntosVida, int cosechaRecolectada, String herramienta) {
		super(nombre, nivel, puntosVida);
		// TODO Auto-generated constructor stub
	}
	private int cosechaRecolectada;
	private String herramienta;

	public void play() {
		if (this.herramienta=="Azada") {
			cosechaRecolectada=cosechaRecolectada+5;
			System.out.println(cosechaRecolectada);
		}
		if (this.herramienta=="Hoz") {
			cosechaRecolectada=cosechaRecolectada+3;
			System.out.println(cosechaRecolectada);
		}
		else {
			System.out.println("No tienes herramienta, no haces nada");
		}
	}
	public void venderCosecha() {
		int dinero=0;
		dinero=cosechaRecolectada*100;
		cosechaRecolectada=0;
	}
}
