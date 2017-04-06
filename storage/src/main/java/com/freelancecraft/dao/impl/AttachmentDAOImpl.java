package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.AttachmentDAO;
import com.freelancecraft.entities.Attachment;

public class AttachmentDAOImpl extends CrudDAOImpl<Attachment> implements AttachmentDAO {

    public AttachmentDAOImpl(Class<Attachment> entityType) {
        super(entityType);
    }
}
