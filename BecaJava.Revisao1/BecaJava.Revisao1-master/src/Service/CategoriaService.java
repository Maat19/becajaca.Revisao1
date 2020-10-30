package Service;

import Model.Categorias;
import Repository.CategoriaRepository;

public class CategoriaService {

	public Categorias getCategoria() {

		CategoriaRepository categoria = new CategoriaRepository();

		return categoria.GetCategoria();

	}

	public void setCategoria(Categorias categoria) {

		CategoriaRepository categoria1 = new CategoriaRepository();

		categoria1.setListadeCategoria(categoria);

	}

}
