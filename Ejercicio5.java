import java.util.Scanner;

class PruebaStatic {
	private static Scanner lector;
	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int resul = leeNumeros();
		System.out.println("Resultado: " + resul);
	}
	
	public static int leeNumeros() {
		System.out.print("Introduce numero: ");
		int num = lector.nextInt;
		if(num == 0) {
			return 0; //condición de parada
		} else {
			int suma = num + leeNumeros();
			return suma;
		}
		
		/*if(num != 0) {
			int suma = num + leeNumeros();
		} else {
			suma = 0;
		}
		return suma;*/
	}
}