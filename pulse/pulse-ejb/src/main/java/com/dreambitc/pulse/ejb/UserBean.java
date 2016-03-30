package com.dreambitc.pulse.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.mongodb.morphia.Datastore;

import com.dreambitc.data.domain.User;

@Stateless
public class UserBean implements UserLocal {

    @Inject
    Datastore datastore;

    public UserBean() {}

    @Override
    public Iterable<User> getUsers() {
        return datastore.find(User.class);
    }
    
    @Override
    public User getUser() {
        System.out.println(datastore);
        return datastore.find(User.class).asList().get(0);
    }
}
