package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsereF {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jose Antonio Euripedes");
		funcionario.setUsuario("joseae");
		funcionario.setSenha("jesus123");
		
		FuncionarioDao dao = new FuncionarioDao();
		dao.adiciona(funcionario);
		
		System.out.println("Gravado!");
	}
}
