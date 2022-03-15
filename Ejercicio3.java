class Empleado {
	private int DNI;
	String nombre;
	String apellidos;
	private int salarioBA = 0;
	boolean reduccionJornada = false;
	
	//metodo ToString();
	
	public int getDNI() {
		return DNI;
	}
	
	public int getsalarioBA() {
		return salarioBA;
	}
	public void setsalarioBA(int salarioBA) {
		this.salarioBA = salarioBA;
	}
	
	public String toString() {
		String result = "nombre" + nombre + "apellidos" + apellidos;
		return result;
	}
}

public class pruebEmpleado {
	public static void main(String[] args) {
		Empleado e1 = new Empleado();
		e1.DNI = "19547545";
		e1.salarioBA = "17000";
		e1.reduccionJornada = true;
		
		System.out.println(e1.toString());
	}
}