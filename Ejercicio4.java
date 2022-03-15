abstract class Vehiculo {
	int numeroKm = 0;
	int[] cochecillos = new int[10];
	
	public void repostar() {
		System.out.println("Vehiculo repostando");
	}
	
	public void pitar() {
		System.out.println("Pitando");
	}
	
	class Coche extends Vehiculo implements Conducible {
		public void pitar() {
			System.out.println("Coche pitando");
		}
		
		public void arrancar() {
			System.out.println("Arrancando coche");
		}
		
		public void acelerar() {
			System.out.println("Acelerando coche");
		}
		
		public void parar() {
			System.out.println("Parando coche");
		}
		
		public Coche(int numeroKm) {
			this.numeroKm = numeroKm;
		}
	}
	
	class Furgoneta extends Vehiculo implements Conducible {
		public void pitar() {
			System.out.println("Furgoneta pitando");
		}
		
		public void arrancar() {
			System.out.println("Arrancando furgoneta");
		}
		
		public void acelerar() {
			System.out.println("Acelerando furgoneta");
		}
		
		public void parar() {
			System.out.println("Parando furgoneta");
		}
		
		public Furgoneta(int numeroKm) {
			this.numeroKm = numeroKm;
		}
	}
	
	interface Conducible {
		public void arrancar();
		public void acelerar();
		public void parar();
	}
}



public class Prueba {
	public static void main(String[] args) {
		Coche c1 = new Coche();
		c1.numeroKm = "100";
		Coche c2 = new Coche();
		c2.numeroKm = "50";
		Furgoneta f1 = new Furgoneta();
		f1.numeroKm = "168";
		Furgoneta f2 = new Furgoneta();
		f2.numeroKm = "127";
		
		Conducible[] Conducibl = new Conducible[4];
		Conducibl[0] = c1;
		Conducibl[1] = c2;
		Conducibl[2] = f1;
		Conducibl[3] = f2;
		
		for(int i = 0; i<Conducibl.length; i++) {
			Conducibl[i].arrancar();
		}
	}
}


//muy parecido a prueba interfaz