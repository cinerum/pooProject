package entities;

import java.util.Scanner;



public class Rotina {	
	Scanner sc = new Scanner(System.in);

	private Integer codigo_Rotina;
	private String descricao;
	private int cod_Treino;
	
	public Rotina(Integer codigo_Rotina, String descricao, int cod_Treino) {
		this.codigo_Rotina = codigo_Rotina;
		this.descricao = descricao;
		//cod_Treino para inserir no banco na tabela rotina o código do treino que a rotina pertence 
		this.cod_Treino = cod_Treino;
	}

	
	public void cadastrarDescricao() {

		int key = -1;

		do {
			System.out.println("#1 Registrar rotina");
			System.out.println("#2 Finalizar registro de treino");
		
			key = sc.nextInt();

			switch (key) {
			case 1: {	
				System.out.println("Digite a rotina");
				setDescricao(sc.next());
				break;

			} 
			
			case 2: {
			System.out.println("PROGRAMA FINALIZADO!");
			sc.close();
				break;
			}
		}
		} while (key != 0);
		System.out.println("PROGRAMA FINALIZADO!");
		sc.close();
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

	public int getCod_Treino() {
		return cod_Treino;
	}

	public void setCod_Treino(int cod_Treino) {
		this.cod_Treino = cod_Treino;
	}
	
	
}
