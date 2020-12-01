package br.com.cadastro.models;

public class Cadastro {
	private String nome;
	private Integer idade;
	private String genero;
	private String email;
	private String senha;
	private String usuario;
	
	
	public Cadastro()
	{     super();
	}

	public Cadastro(String nome, Integer idade, String genero, String email, String senha, String usuario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.email = email;
		this.senha = senha;
		this.usuario = usuario;
	
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
