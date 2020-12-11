package entities;

import java.util.Date;


public abstract class Pessoa {
	
	private int codigo_Pessoa;
	private String nome_Completo;
	private Character genero;
	private String cpf;
	private String cep; 
	private Date data_Nascimento;
	private boolean status_Pessoa = true;
		
	public Pessoa() {

	}
	

	public Pessoa(int codigo_Pessoa, String nome_Completo, Character genero, String cpf, String cep,
			Date data_Nascimento, boolean status_Pessoa) {
		super();
		this.codigo_Pessoa = codigo_Pessoa;
		this.nome_Completo = nome_Completo;
		this.genero = genero;
		this.cpf = cpf;
		this.cep = cep;
		this.data_Nascimento = data_Nascimento;
		this.status_Pessoa = status_Pessoa;
	}



	public Integer getCodigo_Pessoa() {
		return codigo_Pessoa;
	}

	public void setCodigo_Pessoa(Integer codigo_Pessoa) {
		this.codigo_Pessoa = codigo_Pessoa;
	}

	public String getNome_Completo() {
		return nome_Completo;
	}

	public void setNome_Completo(String nome_Completo) {
		this.nome_Completo = nome_Completo;
	}

	public Character getGenero() {
		return genero;
	}

	public void setGenero(Character genero) {
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Date getData_Nascimento() {
		return data_Nascimento;
	}

	public void setData_Nascimento(Date data_Nascimento) {
		this.data_Nascimento = data_Nascimento;
	}

	public boolean isStatus_Pessoa() {
		return status_Pessoa;
	}

	public void setStatus_Pessoa(boolean status_Pessoa) {
		this.status_Pessoa = status_Pessoa;
	}
	
}

	


