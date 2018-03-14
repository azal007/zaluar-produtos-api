package br.com.zaluar.produtos.api.servidor;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import br.com.zaluar.produtos.api.constantes.Constantes;

public class Servidor {

	public static void main(String[] args) throws IOException {
		HttpServer servidor = iniciar();
		
		System.out.println("Servidor rodando");
		
		System.in.read();
		
		servidor.stop();
	}
	
	public static HttpServer iniciar() {
		ResourceConfig config = new ResourceConfig().packages(Constantes.PACOTE_BASE_PROJETO);
		 
		URI uri = URI.create(Constantes.URL_BASE_SERVIDOR_LOCAL);
		HttpServer servidor = GrizzlyHttpServerFactory.createHttpServer(uri, config);
		
		return servidor;
	}
	
	public static void parar(HttpServer servidor) {
		servidor.stop();
	}
}
