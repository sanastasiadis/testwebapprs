package org.stavros.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.stavros.data.DataSingleton;

@Path("/restservice")
public class RestService {
	
	@POST
    public Response helloWorld(String inputJson) {
        return Response.ok().entity("Hello World").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response getMessage(@PathParam("id") String id) {
        Long idLong = Long.parseLong(id);
        return Response.status(200).entity(DataSingleton.getInstance().retrieve(idLong)).build();
    }
    
}
