package Service;

import Model.Aluno;
import Model.Autores;
import Repository.AlunoRepository;
import Repository.AutoresRepository;

public class AutoresService {

	public Autores getAutores() {

		AutoresRepository autores = new AutoresRepository();

		return autores.GetAutores();

	}

	public void setAutores(Autores autores) {

		AutoresRepository autores1 = new AutoresRepository();

		autores1.setListaDeAutor(autores);

	}

}
