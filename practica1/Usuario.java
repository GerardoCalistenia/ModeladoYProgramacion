package practica1;
import java.util.LinkedList;

public class Usuario implements Observer {
	
	
	private String nombre;
	
	private LinkedList<Integer> misSuscripciones;
	
	private LinkedList<String> misServicios;
	
	private int saldo;
	
	public Usuario(String nombre, int saldo) {
		
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public int getSaldo() {
		
		return saldo;
	}
	
	public void suscrbirse(Sujeto empresa) {
		
	}
	
	public void cancelarSuscripcion(Sujeto empresa) {
		
	}
	

	public void update() {
		
	}
	
	
}
