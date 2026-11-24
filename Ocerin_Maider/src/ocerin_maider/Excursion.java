package ocerin_maider;

public class Excursion {
	private String codigo;
	private Destino destino; //en lugar de string pongo destino para llamar al enumerado
	private int participantes;
	private int distancia;
	private int duracion;
	
	public Excursion(String codigo, Destino destino, int participantes, int distancia, int duracion) {
		super();
		this.codigo = codigo;
		this.destino = destino;
		this.participantes = participantes;
		this.distancia = distancia;
		this.duracion = duracion;
	}
	public Excursion(String codigo, String destino, int participantes, int distancia, int duracion) {
		super();
		this.codigo = codigo;
		this.destino = convertirDestino(destino);
		this.participantes = participantes;
		this.distancia = distancia;
		this.duracion = duracion;
	}
	private Destino convertirDestino(String destino) {
		if (destino==null) {
			return Destino.INDEFINIDO;
		}
		switch(destino) {
		case "montaña":
			return Destino.MONTAÑA;
		case "playa":
			return Destino.PLAYA;
		case "ciudad":
			return Destino.CIUDAD;
		default:
			return Destino.INDEFINIDO;
		
		}
	}
	
	@Override
	public String toString() {
		return "Excursion [codigo=" + codigo + ", destino=" + destino + ", participantes=" + participantes
				+ ", distancia=" + distancia + ", duracion=" + duracion + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public int getParticipantes() {
		return participantes;
	}

	public void setParticipantes(int participantes) {
		this.participantes = participantes;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean grupoCompleto () {
		if (getParticipantes()>25) {
			return true;
		}
			return false;
	}
	public double obtenerVelocidadMedia() {
		if (duracion==0) {
			return 0;
		}
		double velocidadMedia=getDistancia()/getDuracion();
		return velocidadMedia;
	}
	
}
