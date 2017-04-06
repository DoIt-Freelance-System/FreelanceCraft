package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.FeedbackDAO;
import com.freelancecraft.entities.Feedback;

public class FeedbackDAOImpl extends CrudDAOImpl<Feedback> implements FeedbackDAO {

    public FeedbackDAOImpl(Class<Feedback> entityType) {
        super(entityType);
    }
}
