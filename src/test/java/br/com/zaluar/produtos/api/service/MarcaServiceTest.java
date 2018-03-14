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
import br.com.zaluar.produtos.api.modelo.Marca;
import br.com.zaluar.produtos.api.servidor.Servidor;

public class MarcaServiceTest {

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
	public void testaQueObterMarcaRetornaMarcaCorreta() {
		Marca marca = target.path("/marcas/1").request().get(Marca.class);
		Assert.assertEquals("Sony", marca.getNome());
	}
}
