package labs;

import com.google.inject.Inject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/goods")
public class HypermarketService {
    @Inject
    private HypermarketManager manager;
    private static Map<Integer, Boards> boards = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Boards getGood(@PathParam("id") Integer id) {
        return boards.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createGood(Boards board) {
        //boards.put(board.getId(), board);
        manager.addGood(board);
        return Response.status(200).entity("Good").build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response replaceGood(Boards board) {
        //boards.replace(board.getId(), board);
        manager.updateGood(board);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteGood(@PathParam("id") Integer id) {
       // boards.remove(position);

        manager.deleteHouseDevice(id);
        return Response.status(200).entity("Good").build();
    }
}
