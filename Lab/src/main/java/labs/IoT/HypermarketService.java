package labs.IoT;

import labs.IoT.persistence.dao.*;



import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;


@Path("/goods")
@SessionScoped
public class HypermarketService implements Serializable {
public HypermarketService(){

}
    private static final long serialVersionUID = 1L;
    @Inject
    GoodDao dao;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Good getGood(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createGood(Good good) {

        dao.add(good);

        return Response.status(200).entity("OK!").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteGood(@PathParam("id") Integer id) {
        dao.delete(id);
        return Response.status(200).entity("OK!").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateGood(Good good) {
        dao.update(good);
        return Response.status(200).entity("OK!").build();
    }
}