package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Funcionarios;
import Model.Livros;

public class LivrosRepository {

	private List<Livros> listadeLivros = new ArrayList<Livros>();

	public Livros GetLivros() {

		Livros livros = new Livros();

		return new Livros();

	}

	public void setListaDeLivros(Livros livro) {

		listadeLivros.add(livro);

	}

}
