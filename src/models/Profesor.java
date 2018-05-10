package models;

public class Profesor extends Persona {
	private String numcontrato;
	private TipoProfesor tipoProfesor;
	public Profesor() {
		
	} 
	
	public Profesor(String nombre, String apellidos, String telefono, String claveidentificacion, String email,
			String numcontrato, TipoProfesor tipoProfesor) {
		super(nombre, apellidos, telefono, claveidentificacion, email); 

		this.numcontrato = numcontrato;
		this.tipoProfesor = tipoProfesor;
	}
 

	public String getNumcontrato() {
		return numcontrato;
	}
	
	public void setNumcontrato(String numcontrato) {
		this.numcontrato = numcontrato;
	}


	public TipoProfesor getTipoProfesor() {
		return tipoProfesor;
	}


	public void setTipoProfesor(TipoProfesor tipoProfesor) {
		this.tipoProfesor = tipoProfesor;
	} 
	
	
	

}
