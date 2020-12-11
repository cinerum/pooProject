package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Treino {
	Scanner sc = new Scanner(System.in);
	//tirar nome_treino porque não é um dado que armazena no banco
	private Integer codigo_Treino;
	private Date hora_Inicio;
	private Date hora_Fim;
	private Date data_Treino;
	private boolean status_Treino = true;
	private Instrutor instrutor;
	private Aluno aluno;
	private List<Rotina> rotinas = new ArrayList<>();
	//inserido cod_Aluno e cod_Instrutor pra setar o valor digitado no banco e fazer a referência ao aluno e instrutor
	private int cod_Aluno;
	private int cod_Instrutor;
	
	public Treino() {
		
	}
	
	public Treino(Integer codigo_Treino, Date hora_Inicio, Date hora_Fim, Date data_Treino, Instrutor instrutor, Aluno aluno) {
		super();
		this.codigo_Treino = codigo_Treino;
		this.hora_Inicio = hora_Inicio;
		this.hora_Fim = hora_Fim;
		this.data_Treino = data_Treino;
		this.instrutor = instrutor;
		this.aluno = aluno;

		
	}
	
	public void CadastrarTreino() throws ParseException {
		
		System.out.println("HORA INICIAL");
		String sHora1 = (sc.next());
		SimpleDateFormat hFormat1 = new SimpleDateFormat("HH:mm:ss");
		setHora_Inicio(hFormat1.parse(sHora1));

		System.out.println("HORA FINAL");
		String sHora2 = (sc.next());
		SimpleDateFormat hFormat2 = new SimpleDateFormat("HH:mm:ss");
		setHora_Fim(hFormat2.parse(sHora2));
		
		System.out.println("DATA INICIO");
		String sData = (sc.next());
		SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
		setData_Treino(dFormat.parse(sData));
		
		System.out.println("Código do instrutor: ");
		setCod_Instrutor(sc.nextInt());
		
		System.out.println("Código do Aluno");
		setCod_Aluno(sc.nextInt());
		
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

	public void setRotinas(List<Rotina> rotinas) {
		this.rotinas = rotinas;
	}

	public int getCod_Aluno() {
		return cod_Aluno;
	}

	public void setCod_Aluno(int cod_Aluno) {
		this.cod_Aluno = cod_Aluno;
	}

	public int getCod_Instrutor() {
		return cod_Instrutor;
	}

	public void setCod_Instrutor(int cod_Instrutor) {
		this.cod_Instrutor = cod_Instrutor;
	}
	
	

}
