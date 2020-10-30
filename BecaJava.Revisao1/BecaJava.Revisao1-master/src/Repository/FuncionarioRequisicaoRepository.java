package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.FuncionarioRequisicao;

public class FuncionarioRequisicaoRepository {

	private List<FuncionarioRequisicao> listadeFuncionarioeRequisicao = new ArrayList<FuncionarioRequisicao>();

	public FuncionarioRequisicaoRepository GetFuncionarioRequisicao() {

		FuncionarioRequisicaoRepository funcionario = new FuncionarioRequisicaoRepository();

		return new FuncionarioRequisicaoRepository();

	}

	public void setListadeFuncionarioDeRequisicao(FuncionarioRequisicao funcionariorequisicao) {

		listadeFuncionarioeRequisicao.add(funcionariorequisicao);

	}

}
