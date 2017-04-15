package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.CrudDAO;
import com.freelancecraft.entities.AbstractEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class CrudDAOImpl<T extends AbstractEntity> implements CrudDAO<T> {

    @Autowired
    private SessionFactory sessionFactory;
    private final Class<T> entityType;

    public CrudDAOImpl(Class<T> entityType) {
        this.entityType = entityType;
    }

    protected final Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(T entity) {
        getSession().save(entity);
    }

    @Override
    public void saveOrUpdate(T entity) {
        getSession().saveOrUpdate(entity);
    }

    @Override
    public T find(Serializable id) {
        return getSession().get(entityType, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return getSession().createQuery("From " + entityType.getName()).list();
    }

    @Override
    public void delete(T entity) {
        getSession().delete(entity);
    }

    @Override
    public void delete(Serializable id) {
        T entity = find(id);
        delete(entity);
    }

    @Override
    public void deleteAll() {
        List<T> entities = findAll();
        for (T entity : entities) {
            getSession().delete(entity);
        }
    }

    @Override
    public void clear() {
        getSession().clear();
    }

    @Override
    public void flush() {
        getSession().flush();
    }
}
