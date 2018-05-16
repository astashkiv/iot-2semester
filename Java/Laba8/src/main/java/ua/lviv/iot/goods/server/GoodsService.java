package ua.lviv.iot.goods.server;

import ua.lviv.iot.goods.goods.Good;
import ua.lviv.iot.goods.persistence.dao.GoodsDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/goods")
@SessionScoped
public class GoodsService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private GoodsDao goodsDao;

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public Good getGood(@PathParam("id") Integer id) {
        return goodsDao.findById(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createGood(Good good) {
        goodsDao.persist(good);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteGood(@PathParam("id") Integer id) {
        goodsDao.delete(id);
        return Response.ok().build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateGood(Good good) {
        //houseDeviceMap.put(id, getHouseDeviceObj2);
        goodsDao.update(good);
        return Response.ok().build();
    }
}
