package com.freelancecraft.service.impl;

import com.freelancecraft.dao.CrudDAO;
import com.freelancecraft.entities.Attachment;
import com.freelancecraft.service.AttachmentService;
import org.springframework.stereotype.Service;

@Service
public class AttachmentServiceImpl extends CrudServiceImpl<Attachment> implements AttachmentService {

    public AttachmentServiceImpl(CrudDAO<Attachment> crudDao) {
        super(crudDao);
    }
}
