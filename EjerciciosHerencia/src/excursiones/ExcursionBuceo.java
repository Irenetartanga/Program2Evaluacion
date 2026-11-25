package excursiones;

public class ExcursionBuceo extends Excursion{

	private boolean certificado;
	private int profundidadMaxima;
	private boolean alquiler;

	public ExcursionBuceo(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, boolean certificado, int profundidadMaxima, boolean alquiler) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		this.certificado = certificado;
		this.profundidadMaxima = profundidadMaxima;
		this.alquiler = alquiler;
	}

	/*sacado el toString*/
	@Override
	public String toString() {
		return super.toString() + "\nExcursionBuceo [certificado=" + certificado + ", profundidadMaxima=" + profundidadMaxima + ", alquiler="
				+ alquiler + "]";
	}

	/*Get y set sacados*/
	public boolean isCertificado() {
		return certificado;
	}

	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}
	public int getProfundidadMaxima() {
		return profundidadMaxima;
	}
	public void setProfundidadMaxima(int profundidadMaxima) {
		this.profundidadMaxima = profundidadMaxima;
	}
	public boolean isAlquiler() {
		return alquiler;
	}
	public void setAlquiler(boolean alquiler) {
		this.alquiler = alquiler;
	}

	@Override
	public double calcularPrecio() {
		if (isAlquiler())
			return super.calcularPrecio()+getNumeroParticipantes()*100;
		return super.calcularPrecio();
	}

}
