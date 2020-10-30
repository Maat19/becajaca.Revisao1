package Model;

import java.sql.Date;

public class Requisicoes {
	
	public int isbn;
	public int id_aluno;
	public Date data_req;
	public Date data_entrega;
	public Date date_entregou;

	public int id_requisicao;
	public int getId_requisicao() {
		return id_requisicao;
	}
	public void setId_requisicao(int id_requisicao) {
		this.id_requisicao = id_requisicao;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}
	public Date getData_req() {
		return data_req;
	}
	public void setData_req(Date data_req) {
		this.data_req = data_req;
	}
	public Date getData_entrega() {
		return data_entrega;
	}
	public void setData_entrega(Date data_entrega) {
		this.data_entrega = data_entrega;
	}
	public Date getDate_entregou() {
		return date_entregou;
	}
	public void setDate_entregou(Date date_entregou) {
		this.date_entregou = date_entregou;
	}
	
}
