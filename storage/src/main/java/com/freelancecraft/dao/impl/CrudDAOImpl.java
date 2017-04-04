package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.CrudDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.jaxb.hbm.spi.EntityInfo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class CrudDAOImpl<T> implements CrudDAO<T, Integer> {

    @PersistenceContext
    protected EntityManager em;

    private SessionFactory sessionFactory;


    @Override
    public T save(T entity) {
        this.em.persist(entity);
        return entity;
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
