import java.util.Scanner;

public class Ejecicio2 {
	public static void main(String[] args) {
		double[][] m;
		int filas;
		int col;
		//int suma = 0; mejor dentro del metodo
		
		
		public static void imprimeSumaColumnas(double[][] m, int filas, int col) {/*
			for(int i = 0; i<filas; i++) {
				for(int j = 0; j<col; j++) {
					System.out.println(m);
				}
			}
			suma = i + j;
			System.out.println(suma);*/
			
			for(int fila = 0; fila<filas; fila++) { //recorre filas
				int suma = 0;
				for(int cols = 0; cols<col; cols++) { //recorre columnas
					System.out.print(m[fila][cols] + " ");
					suma = suma + m[fila][cols];
				}
				System.out.println(suma); //lo podemos cambiar para que en vez de imprimir antes las filas que las columnas, imprima las columnas
										  //antes que las filas, cambiando el interior de los metodos for entre ellos, de manera que quedarian
										  //las fila en el segundo for y las cols en el primero.
			}
			/*
				1 4 5
				3 0 6
				8 2 9
			*/
		}
		
		String[] palabras = {"Hola", "Buen día", null, "Adios", null, "Bye"};
		public static void compactor(String[] array) {
			//este metodo "compacta" el array poniendo lo elementos null al final
		} 
		
		public static void rotarDerecha(int[] array, int posiciones) {
			int last = array.length - 1;
			
			//int[] n = {1, 2, 3, 4};
			//rotarDerecha(n, 2);
			//el contenido ahora es: 3, 4, 1, 2
		}
	}
}