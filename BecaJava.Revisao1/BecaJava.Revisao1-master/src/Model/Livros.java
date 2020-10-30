package Model;

public class Livros {
	
	
	public int Id_livro;
	public int Id_categoria;
	public String Titulo; 
	public int  n_livros;
	
	
	public int getId_livro() {
		return Id_livro;
	}
	public void setId_livro(int Id_livro) {
		Id_livro = Id_livro;
	}
	public int getId_categoria() {
		return Id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		Id_categoria = id_categoria;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public int getN_livros() {
		return n_livros;
	}
	public void setN_livros(int n_livros) {
		this.n_livros = n_livros;
	}

	
	

}
