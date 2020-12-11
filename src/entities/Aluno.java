package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Aluno extends Pessoa {

	public Scanner sc = new Scanner(System.in);

	private static int matricula = 0;
	private int codigoMatricula;
	private float peso;
	private float altura;
	private Date data_Matricula;
	private boolean monitor;
	private ArrayList<Aluno> listAluno = new ArrayList<Aluno>();

	public static int getMatricula() {
		return matricula;
	}

	public static void setMatricula(int matricula) {
		Aluno.matricula = matricula;
	}

	public ArrayList<Aluno> getListAluno() {
		return listAluno;
	}

	public void setListAluno(ArrayList<Aluno> listAluno) {
		this.listAluno = listAluno;
	}

	public void setCodigoMatricula(int codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(int codigo_Pessoa, String nome_Completo, Character genero, String cpf, String cep,
			Date data_Nascimento, boolean status_Pessoa) {
		super(codigo_Pessoa, nome_Completo, genero, cpf, cep, data_Nascimento, status_Pessoa);
		// TODO Auto-generated constructor stub
	}

	public void cadastrarAluno() throws ParseException {

		System.out.println("Nome Completo:");
		setNome_Completo(sc.next());

		System.out.println("CPF:");
		setCpf(sc.next());

		System.out.println("CEP:");
		setCep(sc.next());

		System.out.println("Data de Matricula");
		String sData = (sc.next());
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd");
		setData_Matricula(dFormat.parse(sData));

		System.out.println("Altura:");
		setAltura(sc.nextFloat());

		System.out.println("Peso:");
		setPeso(sc.nextFloat());

		System.out.println("Gênero: ");
		String sexo = sc.next();
		setGenero(sexo.charAt(0));
	}
	

	public int getCodigoMatricula() {
		return codigoMatricula;
	}

	public void setCodigoMatricula(Integer codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Date getData_Matricula() {
		return data_Matricula;
	}

	public void setData_Matricula(Date data_Matricula) {
		this.data_Matricula = data_Matricula;
	}

	public boolean isMonitor() {
		return monitor;
	}

	public void setMonitor(boolean monitor) {
		this.monitor = monitor;
	}

}
