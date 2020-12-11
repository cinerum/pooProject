package entities;

import java.util.ArrayList;
import java.util.List;

public class Atividade {

	private int codigo_Atividade;
	private String tipo_Atividade;
	private List<Turma> turmas = new ArrayList<>();
	
	public Atividade(Integer codigo_Atividade, String tipo_Atividade) {
		this.codigo_Atividade = codigo_Atividade;
		this.tipo_Atividade = tipo_Atividade;
	}

	public Integer getCodigo_Atividade() {
		return codigo_Atividade;
	}

	public void setCodigo_Atividade(Integer codigo_Atividade) {
		this.codigo_Atividade = codigo_Atividade;
	}

	public String getTipo_Atividade() {
		return tipo_Atividade;
	}

	public void setTipo_Atividade(String tipo_Atividade) {
		this.tipo_Atividade = tipo_Atividade;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

}
