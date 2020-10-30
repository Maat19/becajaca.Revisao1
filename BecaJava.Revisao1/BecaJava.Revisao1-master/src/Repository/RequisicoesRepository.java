package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Requisicoes;

public class RequisicoesRepository {

	private List<Requisicoes> listadeRequisicoes = new ArrayList<Requisicoes>();

	public Requisicoes GetRequisicoes() {

		Requisicoes requisicoes = new Requisicoes();

		return new Requisicoes();

	}

	public void setListaDeAluno(Requisicoes requisicoes) {

		listadeRequisicoes.add(requisicoes);

	}

}
