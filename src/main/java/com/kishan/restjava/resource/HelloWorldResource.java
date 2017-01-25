package com.kishan.restjava.resource;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    @GET
    @Timed
    public String sayHello(@QueryParam("name") Optional<String> name) {
        return String.format("Hello world %s", name.orElse("kishan"));
    }

}
