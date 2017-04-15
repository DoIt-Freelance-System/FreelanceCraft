package com.freelancecraft.service.impl;

import com.freelancecraft.dao.CrudDAO;
import com.freelancecraft.entities.Message;
import com.freelancecraft.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl extends CrudServiceImpl<Message> implements MessageService {

    public MessageServiceImpl(CrudDAO<Message> crudDao) {
        super(crudDao);
    }
}
