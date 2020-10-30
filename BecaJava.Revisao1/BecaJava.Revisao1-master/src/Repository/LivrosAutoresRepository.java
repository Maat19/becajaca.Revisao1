package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Aluno;
import Model.LivrosAutores;

public class LivrosAutoresRepository {

	private List<LivrosAutores> listadeLivrodeAutores = new ArrayList<LivrosAutores>();

	public LivrosAutores GetLivrosAutores() {

		LivrosAutores livroautores = new LivrosAutores();

		return new LivrosAutores();

	}

	public void setListaDeAluno(LivrosAutores livrosautores) {

		listadeLivrodeAutores.add(livrosautores);

	}

}
