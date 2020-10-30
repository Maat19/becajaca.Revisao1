package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Funcionarios;

public class FuncionariosRepository {

	private List<Funcionarios> listadeFuncionarios = new ArrayList<Funcionarios>();

	public Funcionarios GetFuncionarios() {

		Funcionarios funcionario = new Funcionarios();

		return new Funcionarios();

	}

	public void setListaDeFuncionarios(Funcionarios funcionario) {

		listadeFuncionarios.add(funcionario);

	}

}
