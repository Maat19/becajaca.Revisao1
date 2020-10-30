package Service;

import Model.Livros;
import Model.LivrosAutores;
import Repository.LivrosAutoresRepository;
import Repository.LivrosRepository;

public class LivrosService {

	public Livros getLivro() {

		LivrosRepository Livro = new LivrosRepository();

		return Livro.GetLivros();

	}

	public void setLivros(Livros livro) {

		LivrosRepository LivrosAutores1 = new LivrosRepository();

		LivrosAutores1.setListaDeLivros(livro);

	}
}
