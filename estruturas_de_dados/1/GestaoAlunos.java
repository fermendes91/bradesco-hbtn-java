package estrutura_de_dados._1;

import java.util.ArrayList;

public class GestaoAlunos {
	
	ArrayList<Aluno> alunos;
	
	public GestaoAlunos() {
		this.alunos = new ArrayList<>();
	}

	public void adicionarAluno(String nome, int idade) {
		Aluno aluno = new Aluno(nome, idade);
		alunos.add(aluno);
	}
	
	public void excluirAluno(String nome, int idade) {
		this.alunos.removeIf(aluno -> aluno.getNome() == nome);
	}
	
	
	public void exibirAlunos() {
		for(Aluno aluno : this.alunos) {
			System.out.println(aluno.toString());
		}
	}
	
	public void buscarAluno(String nome) {
		for(Aluno aluno : this.alunos) {
			if (aluno.getNome() == nome) {
				System.out.println(aluno.toString());
			}
		}
	}

}
