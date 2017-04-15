package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.MessageDAO;
import com.freelancecraft.entities.Message;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDAOImpl extends CrudDAOImpl<Message> implements MessageDAO {

    public MessageDAOImpl(Class<Message> entityType) {
        super(entityType);
    }
}
