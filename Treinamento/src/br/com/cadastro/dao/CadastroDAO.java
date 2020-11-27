package br.com.cadastro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.com.cadastro.conexao.CadastroConexao;
import br.com.cadastro.interfaces.ICadastroDAO;
import br.com.cadastro.models.Cadastro;


public class CadastroDAO implements ICadastroDAO{
	private Connection cnn;
	
	public CadastroDAO() {
		this.cnn = CadastroConexao.getInstance(); // Chama a instancia da conexão com BD		
	}
	
	@Override
	public Boolean verificarSenhaUsuario(String usuario, String senha) {
		Boolean retorno = false;
		try {
			PreparedStatement query = cnn.prepareStatement("SELECT *FROM tab_cadastro where cadastroUsuario = ? and cadastroSenha =?");
			query.setString(1, usuario);
			query.setString(2, senha);
			ResultSet rs = query.executeQuery();
			if(rs.next()) {
				retorno = true;
				
			}
		} catch(Exception erro) {
			System.err.println(erro.toString());
		}finally {
			return retorno;
		}
		
	}

	@Override
	public Integer novoCadastro(Cadastro cd, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deletarCadastro(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer editarCadastro(Cadastro cd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cadastro> buscarCadastroPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cadastro> buscarCadastro(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

		
}
