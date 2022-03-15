/*class Fecha {
	int dia;
	int mes;
	int anio;
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
	}
	public int getEdadActual() {
		//consultar fecha actual
		//calcular dias desde nacimiento hasta fecha actual
	}
	@Override
	public String toString() {
		String resul = dia + "/" + mes + "/" + anio;
		return resul;
	}
}*/

public class Nino {
    int codigo;
	static int autoInc = 1;
	String nombre;
	String apellidos;
	String sexo;
	String fechaNac;
	int estatNac = 0;
	int pesoNac = 0;


public Nino(String nombre, String apellidos, String sexo, String fechaNac, int estatNac, int pesoNac) {
		this.codigo = autoInc++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNac = fechaNac;
		this.estatNac = estatNac;
		this.pesoNac = pesoNac;
		//autoInc++;
	}

    public Nino() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
