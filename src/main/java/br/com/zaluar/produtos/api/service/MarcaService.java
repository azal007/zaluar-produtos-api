package br.com.zaluar.produtos.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.zaluar.produtos.api.modelo.Marca;
import br.com.zaluar.produtos.api.modelo.Produto;

@Path("marcas")
public class MarcaService {

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Marca obter(@PathParam("id") Long id) {
		// TODO FAKE - Implementar de verdade
		
		Marca marca = new Marca();
		marca.setId(1L);
		marca.setNome("Sony");
		return marca;
	}
}
