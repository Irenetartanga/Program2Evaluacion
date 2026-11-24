package herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcursionCultural excursionCultural = new ExcursionCultural ("1", Destino.CIUDAD, 25, 150, 10, true);

		System.out.println(excursionCultural.toString());
		System.out.println(excursionCultural.calcularPrecio());


		ExcursionCultural excursionCultural2 = new ExcursionCultural ("1", Destino.CIUDAD, 25, 150, 10, false);

		System.out.println(excursionCultural2.toString());
		System.out.println(excursionCultural2.calcularPrecio());

		ExcursionBuceo excursionBuceo = new ExcursionBuceo ("1", Destino.PLAYA, 25, 150, 10, false, 50, true);

		System.out.println(excursionBuceo.toString());
		System.out.println(excursionBuceo.calcularPrecio());
		
		ExcursionBuceo excursionBuceo2 = new ExcursionBuceo ("1", Destino.PLAYA, 25, 150, 10, true, 50, true);

		System.out.println(excursionBuceo2.toString());
		System.out.println(excursionBuceo2.calcularPrecio());
	}

}
