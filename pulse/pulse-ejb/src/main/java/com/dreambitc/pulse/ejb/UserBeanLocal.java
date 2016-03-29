package com.dreambitc.pulse.ejb;

import javax.ejb.Local;

import com.dreambitc.data.domain.User;

@Local
public interface UserBeanLocal {
    public Iterable<User> getUsers();

    public User getUser();
}
