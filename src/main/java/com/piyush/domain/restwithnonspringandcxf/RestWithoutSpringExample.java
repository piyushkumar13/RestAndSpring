package com.piyush.domain.restwithnonspringandcxf;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

public interface RestWithoutSpringExample {

    @GET
    @Path("/getname/{name}")
    String getName(@PathParam("name") String name);

    @GET
    @Path("/jsonname")
    @Produces(MediaType.APPLICATION_XML)
    UserDetails queryName(@QueryParam("name") String name);

}
