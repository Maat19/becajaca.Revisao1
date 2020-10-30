package Service;

import Model.Categorias;
import Model.FuncionarioRequisicao;
import Repository.CategoriaRepository;
import Repository.FuncionarioRequisicaoRepository;

public class FuncionarioRequisicaoService {

	public FuncionarioRequisicaoRepository getFuncionarioRequisicao() {

		FuncionarioRequisicaoRepository fr = new FuncionarioRequisicaoRepository();

		return fr.GetFuncionarioRequisicao();

	}

	public void setFuncionarioRequisicao(FuncionarioRequisicao funcionariorequisicao) {

		FuncionarioRequisicaoRepository fr1 = new FuncionarioRequisicaoRepository();

		fr1.setListadeFuncionarioDeRequisicao(funcionariorequisicao);

	}

}
