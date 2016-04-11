package com.dreambitc.data.dao;

import com.dreambitc.data.domain.User;

public interface UserDAO extends DAO<User, Long> {

    /**
     * 
     * @param name
     * @return
     */
    public User findByName(String name);
}
