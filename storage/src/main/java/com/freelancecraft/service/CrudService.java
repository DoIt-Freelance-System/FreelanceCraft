package com.freelancecraft.service;

import com.freelancecraft.exception.entity.EntityAlreadyExistsException;
import com.freelancecraft.exception.entity.NoSuchEntityException;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Interface for generic CRUD operations.
 *
 * @param <T>  entity type.
 */
public interface CrudService<T> {

    /**
     * Create a given entity.
     *
     * @param entity must not be {@literal null}.
     */
    void create(T entity) throws EntityAlreadyExistsException;

    /**
     * Update a given entity.
     *
     * @param entity must not be {@literal null}.
     */
    void update(T entity) throws NoSuchEntityException;

    /**
     * Fetches entity by its id.
     *
     * @param id must not be {@literal null}.
     * @return entity with the given id or {@literal null} if none found.
     */
    T findOne(Serializable id) throws NoSuchEntityException;

    /**
     * Deletes a given entity.
     *
     * @param entity must not be {@literal null}.
     */
    void delete(T entity);

    /**
     * Deletes the entity with the given id.
     *
     * @param id must not be {@literal null}.
     */
    void delete(Serializable id);

    /**
     * Checks whether entity with the given id exists.
     *
     * @param id must not be {@literal null}.
     * @return {@literal true} if entity with the given id exists, {@literal false} otherwise.
     */
    boolean exists(Serializable id);

    /**
     * Returns all entities of the type.
     *
     * @return all entities.
     */
    List<T> fetchPage(int pageNumber, int size);

    /**
     * Get count of users.
     *
     * @return number of user in db.
     */
    Long getCount();
}
