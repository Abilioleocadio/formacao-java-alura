package br.com.caelum.leilao.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.caelum.leilao.dominio.AnoBissexto;

public class AnoBissextoTeste {

	@Test
	public void deveRetornarAnoBissexto() {
		AnoBissexto anoBissexto = new AnoBissexto();
		
		assertEquals(true, anoBissexto.getAnoBissexto(2016));
		assertEquals(true, anoBissexto.getAnoBissexto(2012));
	}
	
	@Test
	public void naoDeveRetornarAnoBissexto() {
		AnoBissexto anoBissexto = new AnoBissexto();
		
		assertEquals(false, anoBissexto.getAnoBissexto(2015));
		assertEquals(false, anoBissexto.getAnoBissexto(2011));
	}
	
}
