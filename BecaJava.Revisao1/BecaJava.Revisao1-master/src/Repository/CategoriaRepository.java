package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.Aluno;
import Model.Autores;
import Model.Categorias;

public class CategoriaRepository {

	private List<Categorias> listadeCategoria = new ArrayList<Categorias>();

	public Categorias GetCategoria() {

		Categorias categoria = new Categorias();

		return new Categorias();

	}

	public void setListadeCategoria(Categorias categoria) {
		
		listadeCategoria.add(categoria);

	}

}
