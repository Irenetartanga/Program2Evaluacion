package excursiones;

public class ExcursionAventura extends Excursion{
	private String Aventura;
	private Dificultad dificultad;

	public ExcursionAventura(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, String aventura, Dificultad dificultad) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		Aventura = aventura;
	}

	@Override
	public String toString() {
		return super.toString() +"ExcursionAventura [Aventura=" + Aventura + "]";
	}

	public String getAventura() {
		return Aventura;
	}

	public void setAventura(String aventura) {
		Aventura = aventura;
	}

	@Override
	public double calcularPrecio() {
		if (dificultad == Dificultad.MEDIO) {
			return super.calcularPrecio()+150;
		}
		if (dificultad == Dificultad.EXTREMO) {
			return super.calcularPrecio()+300;
		}
		return super.calcularPrecio();
	}

}
