package br.com.alura;

import java.util.TreeSet;

public class TestaRecibo {

	public static void main(String[] args) {

		Recibo rec1 = new Recibo();
		rec1.setId(1);
		rec1.setNome("teste");
		Recibo rec2 = new Recibo();
		rec2.setId(2);
		rec2.setNome("teste 2");
		Recibo rec3 = new Recibo();
		rec3.setId(3);
		rec3.setNome("teste 3");
		
		TreeSet<Recibo> tree = new TreeSet<>();
		tree.add(rec1);
		tree.add(rec2);
		tree.add(rec3);
		
		System.out.println(tree);
		
		
	}

}
