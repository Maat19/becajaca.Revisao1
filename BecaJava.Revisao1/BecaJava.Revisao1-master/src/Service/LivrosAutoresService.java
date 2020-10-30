package Service;

import java.util.ArrayList;
import java.util.List;

import Model.Funcionarios;
import Model.LivrosAutores;
import Repository.FuncionariosRepository;
import Repository.LivrosAutoresRepository;

public class LivrosAutoresService {

	public LivrosAutores getLivrosAutores() {

		LivrosAutoresRepository LivrosAutores = new LivrosAutoresRepository();

		return LivrosAutores.GetLivrosAutores();

	}

	public void setLivrosAutores(LivrosAutores livrosautores) {

		LivrosAutoresRepository LivrosAutores1 = new LivrosAutoresRepository();

		LivrosAutores1.setListaDeAluno(livrosautores);

	}

}
