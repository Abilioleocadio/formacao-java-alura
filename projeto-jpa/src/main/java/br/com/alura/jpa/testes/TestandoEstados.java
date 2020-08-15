package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {

	public static void main(String[] args) {
		
		// Trasient (Uma classe que não está sendo gerenciada pelo JPA)
		Conta conta = new Conta();
		conta.setTitular("Almiro");
		conta.setAgencia(123123);
		conta.setNumero(123489799);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Trasient -> Managed (sincronização automática com o Banco)
		em.persist(conta);
		
		// Managed -> Removed (Estado que foi removido a conta do gerenciamento do JPA)
		em.remove(conta);
		
		em.getTransaction().commit();
	}
	
}
