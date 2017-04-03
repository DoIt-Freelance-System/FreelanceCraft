package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.CrudDAO;

public class CrudDAOImpl<T> implements CrudDAO<T, Integer> {

    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public T find(Integer id) {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public void delete(Integer id) {

    }
}
