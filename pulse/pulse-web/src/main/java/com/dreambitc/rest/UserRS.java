package com.dreambitc.rest;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.dreambitc.data.domain.User;
import com.dreambitc.pulse.ejb.UserLocal;

@Path("/user")
@Singleton
public class UserRS {

    @Inject
    UserLocal userBean;

    @Inject
    Example ex;

    @GET
    @Path("/{id}")
    @Produces({"application/json", "application/xml"})
    public User getUserById() {
        System.out.println(userBean);
        return userBean.getUser();
    }
    
}
