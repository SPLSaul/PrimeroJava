package Practica;

public class Principal {

	public static void main(String[] args) {
		Clase clase = new Clase();
		System.out.println(clase.Mensaje());
		System.out.println(clase.MensajePersonalizado("Saul"));
		System.out.println(clase.Mensaje("Rocky"));
	}

}
