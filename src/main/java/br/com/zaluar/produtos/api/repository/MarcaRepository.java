package br.com.zaluar.produtos.api.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.zaluar.produtos.api.modelo.Marca;

@Repository
public class MarcaRepository {

	@PersistenceContext
	private EntityManager em;

	public Marca salvar(Marca marca) {
		em.merge(marca);
		em.flush();
		return marca;
	}
}
