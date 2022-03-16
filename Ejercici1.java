//Modificacion 

import java.util.Scanner;

class Ejercici1 {
	private static void main(String[] args) {
		//lector = new Scanner(System.in);
		int[] miArray = {1, 2, 2, 4, 5};
	}
	
	//ejercicio 1 
	public static boolean estaOrdenado(int[] array) {
		boolean ordenado = true;
		for(int i = 0; i<array.length - 1 && ordenado; i++) {
			if(array[i] > array[i + 1]) { //no está ordenado
				ordenado = false;
			}
		}
		return ordenado;
	}
	
	//ejercicio 2
	public static void Ejercicio2() {
		
	}
	
	//ejercicio 3
	public static double sumaCeldasCondicional (double[][] m, int filas, int col) {
		for(int i = 0; i < filas; i++) {
			double sumaFila = 0;
			double total = 0;
			for(int j = 0; j < col; j++) {
				sumaFila += m[i][j]; //+= es el equivalente a poner sumaFila = sumaFila + m[i][j];
			}
			if(sumaFila > 10) {
				total += sumaFila;
			}
			sumaFila = 0;
		}
		return total;
	}
	
	//ejercicio 4
	public static int darBaja(Empleado[] array, int cont, int codigo) {
		boolean encontrado = false;
		int pos = -1;
		for(int i = 0; i < cont && !encontrado; i++) {
			if(array[i].codigo == codigo) {
				encontrado = true;
				pos = i;
			}
		}
		if(encontrado == true) {
			//borrar
			array[pos] = null;
			//compactar
			for(int j = pos; j < cont - 1; j++) {
				array[i] = array[j + 1];
			}
			array[cont - 1] = null;
			cont--;
		}
		return cont;
	}
	
	
	//ejercicio 6
	public static int sumaNumeros(int inicio, int fin) {
		int suma = 0;
		if(fin > inicio) { //si fin fuera < o = a inicio, en la suma de else se devolveria 0
			suma = fin + sumaNumeros(inicio, fin - 1);
		} else {
			suma = inicio;
		}
		return suma;
	}
}