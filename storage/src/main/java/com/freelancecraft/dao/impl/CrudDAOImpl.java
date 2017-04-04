package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.CrudDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CrudDAOImpl<T> implements CrudDAO<T, Integer> {

    private SessionFactory sessionFactory;

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
        Session session = this.sessionFactory.getCurrentSession();

    }

    @Override
    public void delete(Integer id) {

    }
}
