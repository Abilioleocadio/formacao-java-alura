package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

// br.com.bytebank.banco.test.TesteContas
public class TesteContas {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		// Full Qualified Name FQN
		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.deposita(200);
		
		contaCorrente.transfere(10.0, contaPoupanca);
		
		System.out.println("Conta Corrente saldo: " + contaCorrente.getSaldo());
		System.out.println("Conta Poupança saldo: " + contaPoupanca.getSaldo());
	}

}
