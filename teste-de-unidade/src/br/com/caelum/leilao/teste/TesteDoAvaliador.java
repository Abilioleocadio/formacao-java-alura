package br.com.caelum.leilao.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.leilao.builder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;

public class TesteDoAvaliador {
	
	private Usuario joao;
	private Usuario jose;
	private Usuario maria;
	private Avaliador leiloeiro;
	
	@Before
	public void criaAvaliador() {
		this.joao = new Usuario("João");
		this.jose = new Usuario("José");
		this.maria = new Usuario("Maria");
		this.leiloeiro = new Avaliador();
	}
	
	@Test(expected = RuntimeException.class)
	public void naoDeveAvaliarLeiloesSemNenhumLanceDado() {
			Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo").constroi();
			leiloeiro.avalia(leilao);
	}

	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		
		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo")
				.lance(joao, 250.0)
				.lance(jose, 300.0)
				.lance(maria, 400.0)
				.constroi();

		// parte 2: acao
		leiloeiro.avalia(leilao);
		
		// parte 3: validacao
		double maiorEsperado = 400;
		double menorEsperado = 250;

		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
		
	}
	
	@Test
	public void deveEntenderLeilaoComApenasUmLance() {
		Leilao leilao = new Leilao("Playstation 3 Novo");
		
		leilao.propoe(new Lance(joao, 1000.0));
		
		leiloeiro.avalia(leilao);
		
		assertEquals(1000.0, leiloeiro.getMaiorLance(), 0.00001);
		assertEquals(1000.0, leiloeiro.getMenorLance(), 0.00001);
	}
	
	@Test
	public void deveEncontrarOSTresMaioresLances() {
		Leilao leilao = new Leilao("Playstation 3 Novo");
		
		leilao.propoe(new Lance(joao, 100.0));
		leilao.propoe(new Lance(maria, 200.0));
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(maria, 400.0));
		
		leiloeiro.avalia(leilao);
		
		List<Lance> maiores = leiloeiro.getTresMaiores();
		assertEquals(3, maiores.size());
		assertEquals(400.0, maiores.get(0).getValor(), 0.000001);
		assertEquals(300.0, maiores.get(1).getValor(), 0.000001);
		assertEquals(200.0, maiores.get(2).getValor(), 0.000001);
	}
	
}
