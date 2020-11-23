package segunda.semana;

public class Livro extends ClassePadrao {
	
	
	//private String nome;
	private String editora;
	private String autor;
	private String classificacao;	
	private int anoPublicao;
	
	public Livro() {}
	
	public Livro(String nome, String editora, String classificacao, Integer anoPublicao, String autor) {
		//this.setNome(nome);
		this.nome = nome;
		this.editora = editora;
		this.classificacao = classificacao;
		this.anoPublicao = anoPublicao;
	}
	
	
	public Integer getAnoPublicao() {
		return anoPublicao;
	}
	public void setAnoPublicao(Integer anoPublicao) {
		this.anoPublicao = anoPublicao;
	}
	/*public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}*/
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setAnoPublicao(int anoPublicao) {
		this.anoPublicao = anoPublicao;
	}
	

}


