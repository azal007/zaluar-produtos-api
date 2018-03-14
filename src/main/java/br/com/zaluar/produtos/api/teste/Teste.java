package br.com.zaluar.produtos.api.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.zaluar.produtos.api.modelo.Marca;

public class Teste {

	public static void main(String[] args) {
		Marca marca = new Marca();
		marca.setNome("Teste eclipse");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("produtos");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(marca);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
