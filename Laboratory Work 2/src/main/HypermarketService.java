package main;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import javax.ws. rs.GET;
import javax.ws.rs.Path;

@Path("/goods")
public class HypermarketService {

    Dao

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Boards getToy(@PathParam("id") Integer id) {
        return boards.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createToy(Boards board) {
        boards.put(board.getId(), board);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void replaceToy(@PathParam("id") Integer id, Boards board) {
        boards.replace(id, board);
    }

    @DELETE
    @Path("/{id}")
    public void deleteToy(@PathParam("id") Integer position) {
        boards.remove(position);
    }
}
