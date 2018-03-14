package br.com.zaluar.produtos.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.zaluar.produtos.api.modelo.Produto;

@Path("produtos")
public class ProdutoService {

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Produto obter(@PathParam("id") Long id) {
		// TODO FAKE - Implementar de verdade
		
		Produto produto = new Produto();
		produto.setId(1L);
		produto.setNome("Apple iPhone 6 16GB 4.7 polegadas");
		return produto;
	}
}
