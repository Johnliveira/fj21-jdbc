package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaPesquisar {
	
	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		
		Contato contato = dao.pesquisar(2);
		
		System.out.println(contato.toString());
	}
}
