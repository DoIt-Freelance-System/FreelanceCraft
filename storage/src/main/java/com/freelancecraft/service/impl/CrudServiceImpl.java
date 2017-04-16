package com.freelancecraft.service.impl;

import com.freelancecraft.dao.CrudDAO;
import com.freelancecraft.entities.AbstractEntity;
import com.freelancecraft.exception.entity.EntityAlreadyExistsException;
import com.freelancecraft.exception.entity.NoSuchEntityException;
import com.freelancecraft.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional
public class CrudServiceImpl<T extends AbstractEntity> implements CrudService<T> {

    private final CrudDAO<T> crudDao;

    @Autowired
    public CrudServiceImpl(CrudDAO<T> crudDao) {
        this.crudDao = crudDao;
    }


    @Override
    public void create(T entity) throws EntityAlreadyExistsException {
        //перед созданием сущности сделать проверку на то, что сущность точно новая и еще не создавалась,
        //в противном случае выпустить EntityAlreadyExistsException с соотв. сообщением.
        if (!entity.equals(crudDao.find((Serializable) entity))) {
            crudDao.save(entity);
        } else throw new EntityAlreadyExistsException();

    }

    @Override
    public void update(T entity) throws NoSuchEntityException {
        //перед апдейтом сущности сделать проверку на то, что сущность точно не новая и уже создавалась,
        //в противном случае выпустить NoSuchEntityException с соотв. сообщением.
        if (entity.equals(crudDao.find((Serializable) entity))) {
            crudDao.saveOrUpdate(entity);
        } else throw new NoSuchEntityException();
    }

    @Override
    public T findOne(Serializable id) throws NoSuchEntityException {
        //в случае если сущность по айди не найдена, выпустить NoSuchEntityException с соотв. сообщением.
        T isFound = crudDao.find(id);
        if (isFound == null) {
            throw new NoSuchEntityException();
        } else
            return isFound;
    }


    @Override
    public void delete(T entity) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public boolean exists(Serializable id) {
        return false;
    }

    @Override
    public List<T> fetchPage(int pageNumber, int size) {
        return null;
    }

    @Override
    public Long getCount() {
        return null;
    }
}
