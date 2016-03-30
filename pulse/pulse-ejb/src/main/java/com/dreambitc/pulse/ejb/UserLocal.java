package com.dreambitc.pulse.ejb;

import javax.ejb.Local;

import com.dreambitc.data.domain.User;

@Local
public interface UserLocal {
    public Iterable<User> getUsers();
    public User getUser();
}
