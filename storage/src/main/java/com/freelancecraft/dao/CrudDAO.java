package com.freelancecraft.dao;

import java.io.Serializable;
import java.util.List;

public interface CrudDAO<T> {

    /**
     * @param entity: entity to save
     */
    Serializable save(T entity);

    /**
     * @param entity: entity to save or update
     */
    void saveOrUpdate(T entity);

    /**
     * Find by primary key
     * @param id: primary key
     * @return unique entity
     */
    T find(Serializable id);

    /**
     * Find all records
     * @return: list of entities
     */
    List<T> findAll();

    /**
     * @param entity: entity to delete
     */
    void delete(T entity);

    /**
     * @param id: primary key of entity to delete
     */
    T delete(Serializable id);

    /**
     * Delete all records
     */
    void deleteAll();

    /**
     * Clear session
     */
    void clear();

    /**
     * Flush session
     */
    void flush();

//    abstract String getFindQuery(Integer id);

}
