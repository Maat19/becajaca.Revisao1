package Service;

import Model.Livros;
import Model.Requisicoes;
import Repository.LivrosRepository;
import Repository.RequisicoesRepository;

public class RequisicoesService {

	public Requisicoes getRequisicoes() {

		RequisicoesRepository requisicao = new RequisicoesRepository();

		return requisicao.GetRequisicoes();

	}

	public void setRequisicoes(Requisicoes requisicoes) {

		RequisicoesRepository requisicao = new RequisicoesRepository();

		requisicao.setListaDeAluno(requisicoes);

	}

}
