package reinoMedieval;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personaje [] arrayDeTodo= new Personaje [3];
		
		arrayDeTodo [0]= new Mago("Irene2", 100, 100000, 5, Ataque.Hielo);
		arrayDeTodo [1]= new Soldado("Irene3", 100, 100000, "Espada Larga", 20);
		arrayDeTodo[2] = new Campesino("Irene4", 100, 100000, 5, "Azada");
		System.out.println(arrayDeTodo [0] instanceof Mago); // es correcto
		System.out.println(arrayDeTodo [1] instanceof Mago); // es incorrecto


		Personaje personaje = new Personaje("Irene1", 100, 100000);
		
		personaje.presentarse();
		
		Personaje mago= new Mago("Irene2", 100, 100000, 5, Ataque.Hielo);
		mago.presentarse();
		
		Personaje soldado= new Soldado("Irene3", 100, 100000, "Espada Larga", 20);
		soldado.presentarse();
		soldado.recibirDanio(20);
		
		Personaje campesino= new Campesino("Irene4", 100, 100000, 5, "Azada");
		campesino.presentarse();
		campesino.play();
		
	}

}
