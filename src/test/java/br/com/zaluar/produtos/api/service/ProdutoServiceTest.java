package br.com.zaluar.produtos.api.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.zaluar.produtos.api.constantes.Constantes;
import br.com.zaluar.produtos.api.modelo.Produto;
import br.com.zaluar.produtos.api.servidor.Servidor;

public class ProdutoServiceTest {

	private HttpServer servidor;
	private Client client;
	private WebTarget target;
	
	@Before
	public void antes() {
		servidor = Servidor.iniciar();
		client = ClientBuilder.newClient();
		target = client.target(Constantes.URL_BASE_SERVIDOR_LOCAL);
	}
	
	@After
	public void depois() {
		Servidor.parar(servidor);
	}
	
	@Test
	public void testaQueObterProdutoRetornaProdutoCorreto() {
		Produto produto = target.path("/produtos/1").request().get(Produto.class);
		Assert.assertEquals("Apple iPhone 6 16GB 4.7 polegadas", produto.getNome());
	}
}
