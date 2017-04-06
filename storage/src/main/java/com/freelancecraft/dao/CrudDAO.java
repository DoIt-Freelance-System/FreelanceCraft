package com.freelancecraft.dao;


import javax.persistence.Query;
import java.io.Serializable;

public interface CrudDAO<T, ID extends Serializable> {

    T save(T entity);

    T find(ID id);

    void delete(T entity);

    void delete(ID id);

    abstract String getFindQuery(Integer id);


}
