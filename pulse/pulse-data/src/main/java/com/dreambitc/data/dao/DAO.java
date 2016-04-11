package com.dreambitc.data.dao;

public interface DAO<T, ID> {
    public void save(T entity);
    public T findOne(ID primaryKey);
    public void delete(T entity);

}
