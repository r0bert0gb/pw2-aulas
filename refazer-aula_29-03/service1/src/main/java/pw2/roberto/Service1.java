package pw2.roberto;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/service1")
public class Service1 {

	@GET
	@Path("/{a}/{b}")
	public int soma(@PathParam("a") int a, @PathParam("b") int b) {

		return a + b;
	}
}
