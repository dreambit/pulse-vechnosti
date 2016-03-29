package com.dreambitc.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/pojo")
@Singleton
public class SimpleRESTPojo {

    @GET
    public String pojo() {
        return "pojo fuck111 @ " + this;
    }
}