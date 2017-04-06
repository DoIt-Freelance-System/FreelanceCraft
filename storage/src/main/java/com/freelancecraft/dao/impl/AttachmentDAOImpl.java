package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.AttachmentDAO;
import com.freelancecraft.entities.Attachment;

/**
 * Created by Vlad on 01.04.2017.
 */
public class AttachmentDAOImpl extends CrudDAOImpl<Attachment> implements AttachmentDAO {
    @Override
    public String getFindQuery(Integer id) {
        return "SELECT * FROM ATTACHMENTS a WHERE a.id="+ id;
    }
}
