import javax.swing.JOptionPane;

public class Cliente extends Persona{
	
	private String nro_cliente;
	private String tipo;
	private int clave;
	
	public Cliente(String nombre, String apellido, String dni, String nro_cliente, String tipo, int clave) {
		super(nombre, apellido, dni);
		this.nro_cliente = nro_cliente;
		this.tipo = tipo;
		this.clave= clave;
		System.out.println("soy un cliente me creé");
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getNro_cliente() {
		return nro_cliente;
	}

	public void setNro_cliente(String nro_cliente) {
		this.nro_cliente = nro_cliente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cliente [nro_cliente=" + nro_cliente + ", tipo=" + tipo + "]";
	}
	
	@Override 
	public void ingresar() {
		int clave;
		clave = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido Cliente ingrese clave"));
		
		if(clave==0000){
			JOptionPane.showConfirmDialog(null, "bienvenido a su cuenta");
		}else{
			JOptionPane.showConfirmDialog(null, "Clave incorrecta");
		}
		
		
	}
	
	
	
	
	

}
