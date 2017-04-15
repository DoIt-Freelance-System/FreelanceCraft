package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.UserDAO;
import com.freelancecraft.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends CrudDAOImpl<User> implements UserDAO {

    public UserDAOImpl(Class<User> entityType) {
        super(entityType);
    }
}
