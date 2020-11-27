package br.com.cadastro.interfaces;

import java.util.List;

import br.com.cadastro.models.Cadastro;

public interface ICadastroDAO {
	
	Integer novoCadastro(Cadastro cd, String senha);
	Integer deletarCadastro(Long id);
	Integer editarCadastro(Cadastro cd);
	List<Cadastro> buscarCadastroPorNome(String nome);
	List<Cadastro> buscarCadastro(Long id);
	Boolean verificarSenhaUsuario(String cadastro, String senha);

}
