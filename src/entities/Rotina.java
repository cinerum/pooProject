package entities;

public class Rotina {

	private Integer codigo_Rotina;
	private String descricao;
	
	public Rotina(Integer codigo_Rotina, String descricao) {
		this.codigo_Rotina = codigo_Rotina;
		this.descricao = descricao;
	}

	public Integer getCodigo_Rotina() {
		return codigo_Rotina;
	}

	public void setCodigo_Rotina(Integer codigo_Rotina) {
		this.codigo_Rotina = codigo_Rotina;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
