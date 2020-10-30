package Service;

import Model.Aluno;
import Repository.AlunoRepository;

public class AlunoService {

	public Aluno getAluno() {

		AlunoRepository aluno = new AlunoRepository();

		return aluno.GetAlunos();

	}

	public void setAluno(Aluno aluno) {

		AlunoRepository aluno1 = new AlunoRepository();

		aluno1.setListaDeAluno(aluno);

	}

}
