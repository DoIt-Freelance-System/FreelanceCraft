package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.UserDAO;
import com.freelancecraft.entities.User;

/**
 * Created by Vlad on 01.04.2017.
 */
public class UserDAOImpl extends CrudDAOImpl<User> implements UserDAO {
    @Override
    public String getFindQuery(Integer id) {
        return "SELECT * FROM USERS a WHERE a.id="+ id;
    }
}
