package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.MessageDAO;
import com.freelancecraft.entities.Message;

public class MessageDAOImpl extends CrudDAOImpl<Message> implements MessageDAO {

    public MessageDAOImpl(Class<Message> entityType) {
        super(entityType);
    }
}
