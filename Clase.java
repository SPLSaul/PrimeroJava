package Practica;

public class Clase {
	String name;
	public Clase(String nombre) {
		this.name=nombre;
	}
	public Clase() { }
	public static String Mensaje() {
		return "Hola";
	}
	public static String MensajePersonalizado(String nombre) {
		return "Hola " + nombre;
	}
}
