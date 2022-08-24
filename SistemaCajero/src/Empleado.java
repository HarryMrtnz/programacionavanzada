import javax.swing.JOptionPane;

public class Empleado extends Persona{
	
	private String nro_empleado; 
	private String sector;
	private int clave;
	
	public Empleado(String nombre, String apellido, String dni, String nro_empleado, String sector, int clave) {
		super(nombre, apellido, dni);
		this.nro_empleado = nro_empleado;
		this.sector = sector;
		this.clave = clave;
	}


	public String getNro_empleado() {
		return nro_empleado;
	}


	public void setNro_empleado(String nro_empleado) {
		this.nro_empleado = nro_empleado;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	@Override
	public String toString() {
		return "Empleado [nro_empleado=" + nro_empleado + ", sector=" + sector + "]";
	}
	
	@Override 
	public void ingresar() {
		int clave;
		clave = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido empleado ingrese clave"));
		
		if(clave==0001){
			JOptionPane.showConfirmDialog(null, "empleado ingreso correctamente");
		}else{
			JOptionPane.showConfirmDialog(null, "Clave incorrecta");
		}
		
		
	}
	
	
	
	

}
