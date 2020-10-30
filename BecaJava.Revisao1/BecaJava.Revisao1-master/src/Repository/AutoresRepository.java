package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.Aluno;
import Model.Autores;

public class AutoresRepository {

	private List<Autores> listadeAutor = new ArrayList<Autores>();

	public Autores GetAutores() {

		Autores autores = new Autores();

		return new Autores();

	}

	public void setListaDeAutor(Autores autores) {

		listadeAutor.add(autores);

	}

}
