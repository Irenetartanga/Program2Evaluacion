package herencia;

public class ExcursionCultural  extends Excursion {
	private boolean estudiantes;
	/*Va en mayuscula porque es una constante*/
	private final int DESCUENTO=10;

	public ExcursionCultural(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, boolean estudiantes) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		this.estudiantes = estudiantes;
	}

	/*Get y set sacados*/
	public boolean isEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(boolean estudiantes) {
		this.estudiantes = estudiantes;
	}

	/*sacado el toString*/
	@Override
	public String toString() {
		return super.toString() + "\nExcursionCultural: estudiantes=" + estudiantes;
	}

	@Override
	public double calcularPrecio() {
		if (isEstudiantes())
			return super.calcularPrecio()-super.calcularPrecio()*DESCUENTO/100;
		return super.calcularPrecio();
	}

}
