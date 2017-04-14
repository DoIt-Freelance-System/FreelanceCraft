package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.AttachmentDAO;
import com.freelancecraft.entities.Attachment;
import org.springframework.stereotype.Repository;

@Repository
public class AttachmentDAOImpl extends CrudDAOImpl<Attachment> implements AttachmentDAO {

    public AttachmentDAOImpl(Class<Attachment> entityType) {
        super(entityType);
    }
}
