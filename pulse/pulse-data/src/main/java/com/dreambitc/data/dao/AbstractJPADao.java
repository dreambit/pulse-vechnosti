package com.dreambitc.data.dao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractJPADao<T, ID> implements DAO<T, ID> {
    protected Class<T> entityClass;

    @PersistenceContext
    protected EntityManager em;

    @SuppressWarnings("unchecked")
    public AbstractJPADao() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[1];
    }

    @Override
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public T findOne(ID primaryKey) {
        return em.find(entityClass, primaryKey);
    }

    @Override
    public void delete(T entity) {
        em.remove(entity);
    }

}
