package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.CrudDAO;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.jaxb.hbm.spi.EntityInfo;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.Serializable;

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
        Query query = this.em.createQuery(this.getFindQuery(id));
        T t=(T) query.getSingleResult();
        return t;
    }

    @Override
    public void delete(T entity) {
        Session session = this.sessionFactory.getCurrentSession();

    }

    @Override
    public void delete(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        if (session.load(em.getClass(), id) != null) {
            session.delete(id);
        }

    }
}
