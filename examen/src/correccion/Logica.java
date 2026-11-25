package correccion;
import java.util.Scanner;
public class Logica {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce palabra");
		String palabra=teclado.nextLine();
		if (palabra==null) {
			System.out.println("null no es sospechoso");
		}else {
			if(palabra.length()==0 || palabra.length()==1) {
				System.out.println("la palabra no es sospechosa");
			}
		}

		boolean esSospechosa=false;

		for (int i =0; i<palabra.length()-1; i++) {
			if(palabra.charAt(i)==palabra.charAt(i+1)) {
				System.out.println("palabra sospechosa");
				esSospechosa=true;
			}
		}

		if (!esSospechosa)
			System.out.println("la palabra no es sopechosa");
	}
}