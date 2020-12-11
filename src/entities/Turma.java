package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Turma {

	Scanner sc = new Scanner(System.in);
	private int codigo_Turma;
	private Date hora_Inicial;
	private Date hora_Final;
	private Date data_Inicio;
	private Date data_Fim;
	private boolean status_Turma = true;
	private Instrutor instrutor;
	private List<Aluno> alunos = new ArrayList<>();
	//código do instrutor inserido pra poder setar na tabela turma o codigo do instrutor
	private int cod_Instrutor;

	public Turma() {
		// TODO Auto-generated constructor stub
	}

	public Turma(Integer codigo_Turma, Date hora_Inicial, Date hora_Final, Date data_Inicio, Date data_Fim,
			Instrutor instrutor) {
		this.codigo_Turma = codigo_Turma;
		this.hora_Inicial = hora_Inicial;
		this.hora_Final = hora_Final;
		this.data_Inicio = data_Inicio;
		this.data_Fim = data_Fim;
		this.instrutor = instrutor;
		ArrayList<Aluno> aluno = new ArrayList<Aluno>();
	}

	public void cadastrarTurma() throws ParseException {

		
		System.out.println("HORA INICIAL");
		String sHora1 = (sc.next());
		SimpleDateFormat hFormat1 = new SimpleDateFormat("HH:mm:ss");
		setHora_Inicial(hFormat1.parse(sHora1));

		System.out.println("HORA FINAL");
		String sHora2 = (sc.next());
		SimpleDateFormat hFormat2 = new SimpleDateFormat("HH:mm:ss");
		setHora_Final(hFormat2.parse(sHora2));
		
		System.out.println("DATA INICIO");
		String sData = (sc.next());
		SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
		setData_Inicio(dFormat.parse(sData));
		
		System.out.println("DATA FIM");
		String sDataFim = (sc.next());
		SimpleDateFormat dFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		setData_Fim(dFormat1.parse(sDataFim));

		System.out.println("Código do Instrutor");
		setCod_Instrutor(sc.nextInt());
			
			
		}
	
	

	public Integer getCodigo_Turma() {
		return codigo_Turma;
	}

	public void setCodigo_Turma(Integer codigo_Turma) {
		this.codigo_Turma = codigo_Turma;
	}

	public Date getHora_Inicial() {
		return hora_Inicial;
	}

	public void setHora_Inicial(Date hora_Inicial) {
		this.hora_Inicial = hora_Inicial;
	}

	public Date getHora_Final() {
		return hora_Final;
	}

	public void setHora_Final(Date hora_Final) {
		this.hora_Final = hora_Final;
	}

	public Date getData_Inicio() {
		return data_Inicio;
	}

	public void setData_Inicio(Date data_Inicio) {
		this.data_Inicio = data_Inicio;
	}

	public Date getData_Fim() {
		return data_Fim;
	}

	public void setData_Fim(Date data_Fim) {
		this.data_Fim = data_Fim;
	}

	public boolean isStatus_Turma() {
		return status_Turma;
	}

	public void setStatus_Turma(boolean status_Turma) {
		this.status_Turma = status_Turma;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public int getCod_Instrutor() {
		return cod_Instrutor;
	}

	public void setCod_Instrutor(int cod_Instrutor) {
		this.cod_Instrutor = cod_Instrutor;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	
}
