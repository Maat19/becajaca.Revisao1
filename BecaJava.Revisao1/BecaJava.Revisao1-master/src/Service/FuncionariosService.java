package Service;

import Model.Categorias;
import Model.Funcionarios;
import Repository.CategoriaRepository;
import Repository.FuncionariosRepository;

public class FuncionariosService {

	public Funcionarios getFuncionarios() {

		FuncionariosRepository funcionarios = new FuncionariosRepository();

		return funcionarios.GetFuncionarios();

	}

	public void setCategoria(Funcionarios funcionarios) {

		FuncionariosRepository funcionario1 = new FuncionariosRepository();

		funcionario1.setListaDeFuncionarios(funcionarios);

	}

}
