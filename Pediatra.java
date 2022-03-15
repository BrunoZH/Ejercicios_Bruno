import java.util.Scanner;

class Pediatra {
        static Scanner lector = new Scanner(System.in);
        static Nino[] arrayNinos = new Nino[100];
        static int contador = 0;
        //static int i; para bucles for, no esta bien porque no tiene un significado para la clase
		
		/*System.out.printl("Dame numero: ");
	int num = lector.nextInt();
	while(num != 0) {
		System.out.prinl("Dame numero: ");
		int num = lector.nextInt();
	}*/
	
	public static void darAlta() {
		System.out.println("Introduzca datos");

		lector.nextLine();
		
		System.out.println("Escriba un nombre: ");
		String nombre = lector.nextLine();
		
		System.out.println("Escriba unos apellidos: ");
		String apellidos = lector.nextLine();
		
		System.out.println("Deme el genero del nino: ");
		String sexo = lector.nextLine();
		
		System.out.println("Su fecha de nacimiento: ");
		String fechaNac = lector.nextLine();
		
		//lector.nextLine();
		System.out.println("Cuanto media: ");
		int estatNac = lector.nextInt();
		
		lector.nextLine();
		System.out.println("Cuanto pesaba: ");
		int pesoNac = lector.nextInt();
		
		
               //lector.nextLine();
		Nino n1 = new Nino();
		
		arrayNinos[contador] = new Nino(nombre, apellidos, sexo, fechaNac, estatNac, pesoNac);
		contador++;
		System.out.println("objetos creados :" + contador);
		
                //lector.nextLine();
	}
	
	public static void darBaja(int llave) {
		for(int i = 0; i < contador; i++) {
			if(llave == arrayNinos[i].codigo) {
				arrayNinos[i] = null;
				contador--;
				//da un error si se hace con más de dos niños, 
				//ya que si se borra el primero no lee el resto,
				//pasa así con el resto de casos, si tenemos 3 niños y borramos el segundo no 
				//lee el último
				
				for(int j = i++; j < contador; j++) {
					if(arrayNinos[j] != null) {
						arrayNinos[j - 1] = arrayNinos[j];
						arrayNinos[j - 1].codigo = arrayNinos[j - 1].codigo - 1;
						//Nino.codigo--;
					} else break;
				}
				//break;
			}
		}
	}
	
	public static void listApNo() {
		/*int min;
		int pos;
		boolean cambio = false;
		for(int i=0; i < arrayNinos.length - 1; i++) {
			min = arrayNinos[i];
			pos = i;
			for(int j=i+1; j < arrayNinos.length; j++) {
				if( min > arrayNinos[j]) {
					min = arrayNinos[j];
					pos = j;
					cambio = true;
				}
			}
			if (cambio) {
				arrayNinos[pos] = arrayNinos[i];
				arrayNinos[i] = min;
				cambio = false;
			} 
			
		}*/
		//no los ordena de mayor a menor según el apellido, 
		//los ordena sacando el apellido primero, nada más
	
		for(int i=0; i<contador; i++) {
			System.out.println(arrayNinos[i].apellidos + " " + arrayNinos[i].nombre + " " + arrayNinos[i].sexo + " " + arrayNinos[i].fechaNac + " " + arrayNinos[i].estatNac + " " + arrayNinos[i].pesoNac);
		}
	}
	
	public static void listCod() {
		//System.out.printf("%4s %20s", "COD", "NOMBRE");
		for(int i=0; i<contador; i++) {
			System.out.println(arrayNinos[i].codigo + " " + arrayNinos[i].nombre + " " + arrayNinos[i].apellidos + " " + arrayNinos[i].sexo + " " + arrayNinos[i].fechaNac + " " + arrayNinos[i].estatNac + " " + arrayNinos[i].pesoNac);
		}
	}
	
	public static void buscaAp() {
		System.out.println("Introduzca un apellido.");
		String busqueda = lector.nextLine();
		System.out.println(busqueda); 
		//solo saca el apellido por pantalla,
		//no muestra nada más, ya que no se puede poner (arrayNinos[i].nombre) ni (nombre)
		//para imprimir por lo menos el nombre
	}
	
	public static void buscaPeso() {
		System.out.println("Introduzca el peso a buscar.");
		int peso = lector.nextInt();
		System.out.println("Este es el nino que has buscado por peso: " + peso);
		//igual que la anterior solo saca el peso
	}
	
	public static void calcPer() {
	}
	
	public static void calcPerEstat() {
	}
	
	public static void cargaDatos() {
		System.out.println(contador);
		System.out.println("Datos cargados con exito.");
	}
	
		public static void Print() {
			System.out.println("Menu: ");
			System.out.println(" ");
			System.out.println("1. Dar de alta un nino");
			System.out.println("2. Dar de baja un nino");
			System.out.println("3. Listado ordenado por codigo");
			System.out.println("4. Listado ordenado por apellidos y nombre");
			System.out.println("5. Buscar nino por apellido");
			System.out.println("6. Buscar ninos comprendidos por rango de peso");
			System.out.println("7. Calcular percentil");
			System.out.println("8. Calcular percentil de estatura");
			System.out.println("9. Cargar datos automaticamente para pruebas");
			System.out.println("10. Salir del menu");
		}
	
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            int indice;
		
		//arrayNinos[j].apellidos.compareTo(arrayNinos[j+1].apellidos);
		//si devuelve menor que cero va antes y estan ordenados, si es mayor que cero es incorrecto
		
		
                
		 boolean salir = false;
                 int opcion;
			
            while (!salir) {
				Print();
                  opcion = lector.nextInt();
				switch (opcion) {
 
                    case 1: //(altura * altura) / peso - peso  
						 darAlta();
                         break;
			
                    case 2:
                         System.out.println("Inserta el codigo: ");
						 int llave = lector.nextInt();
						 darBaja(llave);
                         break;
			
                    case 3:
						listCod();
                        break;
			
                    case 4:
						listApNo();
                        break;
			
                    case 5:
						buscaAp();
                        break;
			
                    case 6:
						//buscaPeso();
                        break;
			
                    case 7:
						//calcPer();
                        break;
			
                    case 8:
						//calcPerStat();
                        break;
			
                    case 9:
						//cargaDatos();
                        break;
			
                    case 10:
					salir = true;
					System.out.println("Hasta la vista!");
                        break;
			}
                }
					opcion = lector.nextInt();
	}
	
	
	/*public static void listarPorCodigo() {
		//imprimir cabecera
		System.out.printf("%4s %20s", "COD", "NOMBRE");
		//imprimir datos
		for(int i=0; i<contador; i++) {
			System.out.println(arrayNinos[i].nombre);
		}
	}*/
}

// (01, "Margarita", "Salas Prado", "Femenino", "2022-02-11", 50, 3);
// (02, "Francisco", "Fernandez Avilar", "Masculino", "2019-11-28", 49, 4);
// (03, "Maria", "Gonzalez Abad", "Femenino", "2020-08-16", 50, 4);
// (04, "Sara", "Vazquez Suarez", "Femenino", "2015-04-30", 51, 3);
// (05, "Alvaro", "Garcia Garcete", "Masculino", "2017-12-15", 50, 5);
// (06, "Marta Valentina", "Simon Fernandez", "Femenino", "2019-02-14", 55, 3);
// (07, "Saul", "Lopez Delibes", "Masculino", "2014-05-13", 52, 4);
// (08, "Daniel", "Gutierrez Martinez", "Masculino", "2012-02-24", 51, 3);
// (09, "Dolores", "Lopez Lara", "Femenino", "2020-09-30", 50, 2);
// (10, "Alberto", "Gutierrez Marinez", "Masculino", "2014-07-02", 54, 4);

    /*nino() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/