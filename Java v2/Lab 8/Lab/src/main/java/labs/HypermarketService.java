package labs;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/goods")
public class HypermarketService {

    private static Map<Integer, Boards> boards = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Boards getGood(@PathParam("id") Integer id) {
        return boards.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createGood(Boards board) {
        boards.put(board.getId(), board);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void replaceGood(Boards board) {
        boards.replace(board.getId(), board);
    }

    @DELETE
    @Path("/{id}")
    public void deleteGood(@PathParam("id") Integer position) {
        boards.remove(position);
    }
}
