import java.util.Scanner;

public class Ejecicio1 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int ini;
		int fin;
		
		public static int[] copiaArray(int[] num, int ini, int fin) {
			int[] copia = new int[fin - ini + 1]; //deberia ser la posicion final mas la posicion inicial
			
			//copiamos los elementos
			for(int i = ini; i<=fin; i++) {
				copia[i - ini] = num[i];
			}
			return copia; //si en el metodo hubiera un void en vez de un int no devolveria nada
			System.out.println(copia);
		}
	}
}