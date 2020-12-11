package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Treino {
	Scanner sc = new Scanner(System.in);
	//Adicionei nome_Treino
	private Integer codigo_Treino;
	private String nome_Treino;
//	private Date hora_Inicio;
//	private Date hora_Fim;
//	private Date data_Treino;
	private boolean status_Treino = true;
	private Instrutor instrutor;
	private Aluno aluno;
	private List<Rotina> rotinas = new ArrayList<>();
	
	public Treino() {
		
	}
	
	public Treino(Integer codigo_Treino, Date hora_Inicio, Date hora_Fim, Date data_Treino, Instrutor instrutor, Aluno aluno) {
		super();
		this.codigo_Treino = codigo_Treino;
		this.instrutor = instrutor;
		this.aluno = aluno;
	}
	
	public void CadastrarTreino() {
		int cont = 1;
			setCodigo_Treino(sc.nextInt(cont));			
			System.out.print("Codigo do Treino: "+cont);
		cont++;
		System.out.println("Nome do Treino: ");
		setNome_Treino(sc.next());
	}

	public String getNome_Treino() {
		return nome_Treino;
	}

	public void setNome_Treino(String nome_Treino) {
		this.nome_Treino = nome_Treino;
	}

	public Integer getCodigo_Treino() {
		return codigo_Treino;
	}

	public void setCodigo_Treino(Integer codigo_Treino) {
		this.codigo_Treino = codigo_Treino;
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

