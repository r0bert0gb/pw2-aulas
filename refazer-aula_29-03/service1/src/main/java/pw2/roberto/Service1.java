package pw2.roberto;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/service1")
public class Service1 {

	@Inject
	@RestClient
	InterfaceSegundo segundo;

	@GET
	@Path("/{a}/{b}")
	public int soma(@PathParam("a") int a, @PathParam("b") int b) {

		return segundo.soma(a, b);
	}
}
