package practica1;

public interface Sujeto {
	
	public String getNombre();
	
	public Usuario getCliente(String nombre);
	
	public void registrar(Usuario cliente);
	
	public void cancelar();
	
	public void cobrar(Usuario cliente);
	
	public void actualizar(Usuario cliente);
	
}
