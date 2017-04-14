package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.FeedbackDAO;
import com.freelancecraft.entities.Feedback;
import org.springframework.stereotype.Repository;

@Repository
public class FeedbackDAOImpl extends CrudDAOImpl<Feedback> implements FeedbackDAO {

    public FeedbackDAOImpl(Class<Feedback> entityType) {
        super(entityType);
    }
}
