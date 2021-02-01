package br.com.caelum.leilao.servico;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

public class AvaliadorTeste {

	@Test
	public void deveCalcularAMedia() {

		// parte 1: cenario
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Plastation 3 Novo");

		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		leilao.propoe(new Lance(maria, 500.0));

		// parte 2: acao
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		// parte 3: validacao
		Assert.assertEquals(400, leiloeiro.getMedia(), 0.00001);

	}
	
	@Test
	public void testaMediaDeZeroLance() {
		
		// cenario
//		Usuario ewerton = new Usuario("Ewerton");
		
		// acao 
		Leilao leilao = new Leilao("Iphone 7");
		
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		// validacao
		Assert.assertEquals(0, avaliador.getMedia(), 0.0001);
		
	}

}
