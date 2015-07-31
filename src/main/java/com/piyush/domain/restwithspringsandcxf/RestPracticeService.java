package com.piyush.domain.restwithspringsandcxf;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

public interface RestPracticeService {

    @GET
    @Path("/getname/{name}")
    String getName(@PathParam("name") String name);

    @GET
    @Path("/jsonname")
    @Produces(MediaType.APPLICATION_JSON)
    User getNameInJson(@QueryParam("name") String name);
}
