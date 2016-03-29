package com.dreambitc.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.dreambitc.rest.SimpleRESTPojo;
import com.dreambitc.rest.UserRS;

@ApplicationPath("/rest-prefix")
public class ApplicationConfig extends Application {

    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(SimpleRESTPojo.class);
        classes.add(UserRS.class);

        return classes;
    }
}
