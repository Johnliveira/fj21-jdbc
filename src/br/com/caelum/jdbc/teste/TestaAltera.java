package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {
	
	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();
		
		contato.setNome("Jey");
		contato.setEmail("osmaziado@outlook.com.br");
		contato.setEndereco("Av. Ana godoy de sousa 3560");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 2);
		
		dao.altera(contato);
		
		System.out.println("Alterado!");
	}
}
