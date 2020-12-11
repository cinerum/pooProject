package entities;

public class Telefone {

	private int codigo_Telefone;
	private String residencial;
	private String celular;
	
	public Telefone(int codigo_Telefone, String residencial, String celular) {
		this.codigo_Telefone = codigo_Telefone;
		this.residencial = residencial;
		this.celular = celular;
	}

	public int getCodigo_Telefone() {
		return codigo_Telefone;
	}

	public void setCodigo_Telefone(int codigo_Telefone) {
		this.codigo_Telefone = codigo_Telefone;
	}

	public String getResidencial() {
		return residencial;
	}

	public void setResidencial(String residencial) {
		this.residencial = residencial;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
}
