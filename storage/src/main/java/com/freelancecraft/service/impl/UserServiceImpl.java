package com.freelancecraft.service.impl;

import com.freelancecraft.dao.CrudDAO;
import com.freelancecraft.entities.User;
import com.freelancecraft.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CrudServiceImpl<User> implements UserService {

    public UserServiceImpl(CrudDAO<User> crudDao) {
        super(crudDao);
    }
}
