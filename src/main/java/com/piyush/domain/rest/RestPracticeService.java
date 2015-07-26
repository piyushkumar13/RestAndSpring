package com.piyush.domain.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/practice")
public interface RestPracticeService {

    @GET
    @Path("/getname/{name}")
    String getName(@PathParam("name") String name);

    @GET
    @Path("/jsonname")
    @Produces(MediaType.APPLICATION_JSON)
    User getNameInJson(@QueryParam("name") String name);
}
