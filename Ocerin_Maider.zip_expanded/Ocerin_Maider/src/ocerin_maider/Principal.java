package ocerin_maider;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
			int opcion=0;
			int numExcursiones=0;
			Excursion [] excursiones =new Excursion [30];
			do {
				System.out.println("\n--- MENU ---");
				System.out.println ("1. Introducir excursiones.");
				System.out.println("2. Mostrar excrusiones que superen la velocidad media.");
				System.out.println("3. Inscribir participantes");
				System.out.println("4. Eliminar excursion.");
				System.out.println("5. Mostrar todas las excursiones.");
				System.out.println("6. Salir.");
				opcion = teclado.nextInt();
				teclado.nextLine();
				
				switch (opcion) {
				case 1:
					numExcursiones=introducir(teclado, excursiones, numExcursiones);
					break;
				case 2:
					mostrarVelocidadSuperada(teclado, excursiones, numExcursiones);
					break;
				case 3:
					inscribirParticipantes(teclado, excursiones, numExcursiones);
					break;
				case 4:
					eliminar(teclado, excursiones, numExcursiones);
					break;
				case 5:
					mostrar(excursiones, numExcursiones);
					break;
				case 6:
					System.out.println("Has salido");
					break;
					
				}
			}while (opcion!=6);
			
			teclado.close();
		}

	public static void inscribirParticipantes(Scanner teclado, Excursion[] excursiones, int numExcursiones) {
		if (numExcursiones==0) {
			System.out.println("no hay excursiones registradas");
		}
		System.out.println("introduce el codigo de la excursion");
		String codigo=teclado.nextLine();
		for (int i = 0; i < excursiones.length; i++) {
			if (excursiones[i].getCodigo().equals(codigo) && excursiones[i].getParticipantes()<25) {
				System.out.println("cuantos participantes quieres añadir?");
				int participantesExtra=teclado.nextInt();
				
				//compruebo que haya suficientes huecos como participantes extra que quiero añadir
				if(participantesExtra<=(25-excursiones[i].getParticipantes())) {
					int nuevosParticipantes=participantesExtra + excursiones[i].getParticipantes();
					excursiones[i].setParticipantes(nuevosParticipantes);
				}else {
					System.out.println("no hay sitio para tantos participantes nuevos");
				
				}

			}
		}

	}


	public static void eliminar(Scanner teclado, Excursion[] excursiones, int numExcursiones) {
		if (numExcursiones==0) {
			System.out.println("no hay excrusiones registradas");
		}
		System.out.println("introduce el destino de la excursion que quieres eliminar");
		String destino=teclado.nextLine();
		for (int i = 0; i < numExcursiones; i++) {
			if (excursiones[i] != null && excursiones[i].getDestino().equals(destino)) {
				excursiones[i]=null;
			}else {
				System.out.println("no se ha encontrado esa excursion");
				break;
			}
		}
	}

	public static void mostrar(Excursion[] excursiones, int numExcursiones) {
		for (int i=0; i<numExcursiones; i++) {
			//me muestra la lista cuando sea distinta a null
			if (excursiones[i]!=null) {
			System.out.println(excursiones[i].toString());
			}
		}
	}

	public static void mostrarVelocidadSuperada(Scanner teclado, Excursion[] excursiones, int numExcursiones) {
		System.out.println("introduce la velocidad media a comparar");
		double velocidadIntroducida=teclado.nextDouble();
		boolean encontrada=false;
		for (int i=0; i<excursiones.length; i++) {
			//compruebo si las velocidades medias son superiores a la introducida por teclado
			if (excursiones[i]!=null && excursiones[i].obtenerVelocidadMedia()>velocidadIntroducida) {
				System.out.println("codigo excursion: " + excursiones[i].getCodigo() + " velocidad media: " + excursiones[i].obtenerVelocidadMedia());
				encontrada=true;
			}
		}
				
		if (!encontrada) {
			System.out.println("ninguna excursion supera esa velocidad media");
		}
	}

	public static int introducir(Scanner teclado, Excursion[] excursiones, int numExcursiones) {
		String codigo;
		//INTRODUCIMOS CODIGO
		if (numExcursiones==30) {
			System.out.println("no se pueden introducir mas");
			return numExcursiones;
		}
		do {
			System.out.println("introduce el codigo de excursion");
			codigo=teclado.nextLine();
			if (existeCodigo(excursiones, numExcursiones, codigo)) {
				System.out.println("ese codigo ya existe");
			}
		}while (existeCodigo(excursiones, numExcursiones, codigo));
		
		//INTRODUCIMOS DESTINO ENUMERADO
		Destino destinoEnum;
		String destino;
		System.out.println("introduce el destino");
		destino=teclado.nextLine();
	
		switch (destino.toUpperCase()) {
		case "montaña":
			destinoEnum=Destino.MONTAÑA;	
		case "playa":
			destinoEnum=Destino.PLAYA;
		case "ciudad":
			destinoEnum=Destino.CIUDAD;
		default: 
			destinoEnum=Destino.INDEFINIDO;
		}
		
		//INTRODUCIMOS PARTICIPANTES
		System.out.println("introduce participantes");
		int participantes=teclado.nextInt();
		if (participantes < 0 || participantes>25) {
			System.out.println("error no se pueden meter mas de 25");
		}
		teclado.nextLine();
		//INTRODUCIMOS DISTANCIA
		System.out.println("introduce distancia");
		int distancia=teclado.nextInt();
		if (distancia <0) {
			System.out.println("Error, no se puede introducir una distancia negativa");
		}
		//INTRODUCIMOS DURACION
		System.out.println("introduce duracion");
		int duracion=teclado.nextInt();
		if (duracion <0) {
			System.out.println("Error, no se puede introducir una duracion negativa");
		}
		
		teclado.nextLine();//limpio el teclado
		
		excursiones[numExcursiones]=new Excursion(codigo, destino, participantes, distancia, duracion);
		
		System.out.println("excrusion introducida correctamente");
		return numExcursiones + 1;
	}
		
	
	public static boolean existeCodigo(Excursion[] excursiones, int numExcursiones, String codigo) {
		for (int i=0; i<excursiones.length; i++) {
			if (excursiones[i]!=null && excursiones[i].getCodigo().equals(codigo)) {
				return true;
			}
		}
		return false;
	}
	
}



