package br.com.repository;

import br.com.entidades.Pessoa;

public interface IDaoPessoa {

	Pessoa consultaUsuario(String login, String senha);	
	
}
