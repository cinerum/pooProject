package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Treino {
	
	private Integer codigo_Treino;
	private Date hora_Inicio;
	private Date hora_Fim;
	private Date data_Treino;
	private boolean status_Treino = true;
	private Instrutor instrutor;
	private Aluno aluno;
	private List<Rotina> rotinas = new ArrayList<>();
	
	public Treino(Integer codigo_Treino, Date hora_Inicio, Date hora_Fim, Date data_Treino, Instrutor instrutor, Aluno aluno) {
		super();
		this.codigo_Treino = codigo_Treino;
		this.hora_Inicio = hora_Inicio;
		this.hora_Fim = hora_Fim;
		this.data_Treino = data_Treino;
		this.instrutor = instrutor;
		this.aluno = aluno;
	}
	
	

	public Integer getCodigo_Treino() {
		return codigo_Treino;
	}

	public void setCodigo_Treino(Integer codigo_Treino) {
		this.codigo_Treino = codigo_Treino;
	}

	public Date getHora_Inicio() {
		return hora_Inicio;
	}

	public void setHora_Inicio(Date hora_Inicio) {
		this.hora_Inicio = hora_Inicio;
	}

	public Date getHora_Fim() {
		return hora_Fim;
	}

	public void setHora_Fim(Date hora_Fim) {
		this.hora_Fim = hora_Fim;
	}

	public Date getData_Treino() {
		return data_Treino;
	}

	public void setData_Treino(Date data_Treino) {
		this.data_Treino = data_Treino;
	}

	public boolean isStatus_Treino() {
		return status_Treino;
	}

	public void setStatus_Treino(boolean status_Treino) {
		this.status_Treino = status_Treino;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Rotina> getRotinas() {
		return rotinas;
	}
	
	

}

