package entities;

import java.util.Date;
import java.util.Scanner;

public class Instrutor extends Pessoa {
	Scanner sc = new Scanner(System.in);
	private int codigo_Instrutor;
	private String titulacao;

	public Instrutor() {
	}

	

	public Instrutor(int codigo_Pessoa, String nome_Completo, Character genero, String cpf, String cep,
			Date data_Nascimento, boolean status_Pessoa) {
		super(codigo_Pessoa, nome_Completo, genero, cpf, cep, data_Nascimento, status_Pessoa);
		// TODO Auto-generated constructor stub
	}



	public void cadastrarInstrutor() {
		System.out.println("Cadastrar Instrutor");

		System.out.println("Nome Completo:");
		setNome_Completo(sc.next());

		System.out.println("CPF:");
		setCpf(sc.next());

		System.out.println("CEP:");
		setCep(sc.next());
		
		System.out.println("Titulação: ");
		setTitulacao(sc.next());

	}

	public int getCodigo_Instrutor() {
		return codigo_Instrutor;
	}

	public void setCodigo_Instrutor(int codigo_Instrutor) {
		this.codigo_Instrutor = codigo_Instrutor;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	
	
}

