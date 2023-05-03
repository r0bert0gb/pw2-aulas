package dev.ifrs;

import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.SimplyTimed;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class Health {

	// Coisas da aula dia 03 de Maio
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Counted(name = "Contador", description = "Descrição do contador")
	// @Timed(name = "Tempo", description = "Descrição do Timed")
	@SimplyTimed(name = "Tempo Simplificado", description = "description do tempo simplificado")
	public String hello() {
		return "Hello from RESTEasy Reactive";
	}
}
