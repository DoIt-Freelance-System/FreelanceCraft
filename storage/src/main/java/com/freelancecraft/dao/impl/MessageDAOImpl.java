package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.MessageDAO;
import com.freelancecraft.entities.Message;

/**
 * Created by Vlad on 01.04.2017.
 */
public class MessageDAOImpl extends CrudDAOImpl<Message> implements MessageDAO {
    @Override
    public String getFindQuery(Integer id) {
        return "SELECT * FROM MESSAGES a WHERE a.id="+ id;
    }


}
