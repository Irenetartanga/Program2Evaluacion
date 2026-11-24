package herencia;

public class ExcursionAventura extends Excursion{
	private String Aventura;

	public ExcursionAventura(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, String aventura) {
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


}
