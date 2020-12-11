package app;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Aluno;
import entities.Instrutor;
import entities.Turma;

public class App {

	public static void main(String[] args) throws ParseException {
		ArrayList<Aluno> listAluno = new ArrayList<Aluno>();
		ArrayList<Instrutor> listInstrutor = new ArrayList<Instrutor>();
		ArrayList<Turma> listTurma = new ArrayList<Turma>();
		Scanner sc = new Scanner(System.in);
		int key = -1;

		do {
			System.out.println("#1 Cadastrar Aluno");
			System.out.println("#2 Cadastrar Instrutor");
			System.out.println("#3 Cadastrar Turma");
			System.out.println("#4 Cadastrar Treino");
			System.out.println("#5 Consultar Treino");
			System.out.println("#6 Registrar Historico de treino");
			System.out.println();

			key = sc.nextInt();

			switch (key) {
			case 1: {
				Aluno aluno = new Aluno();
				aluno.cadastrarAluno();
				listAluno.add(aluno);
				break;
			}
			case 2: {
				Instrutor instrutor = new Instrutor();
				instrutor.cadastrarInstrutor();
				listInstrutor.add(instrutor);
				break;
			}
			case 3: {
				Turma turma = new Turma();
				turma.cadastrarTurma();
				listTurma.add(turma);
			}
			
			case 4:
				//
			}

		} while (key != 0);
		System.out.println("PROGRAMA FINALIZADO!");
		sc.close();
	}

}
