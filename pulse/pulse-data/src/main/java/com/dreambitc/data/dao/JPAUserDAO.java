package com.dreambitc.data.dao;

import com.dreambitc.data.domain.User;


public class JPAUserDAO extends AbstractJPADao<User, Long> implements UserDAO {

    @Override
    public User findByName(String name) {
        return em.createNamedQuery(User.BY_NAME, User.class).getSingleResult();
    }

}
