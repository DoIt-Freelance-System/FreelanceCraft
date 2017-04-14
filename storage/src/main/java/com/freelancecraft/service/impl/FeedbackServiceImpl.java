package com.freelancecraft.service.impl;

import com.freelancecraft.dao.CrudDAO;
import com.freelancecraft.entities.Feedback;
import com.freelancecraft.service.FeedbackService;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl extends CrudServiceImpl<Feedback> implements FeedbackService {

    public FeedbackServiceImpl(CrudDAO<Feedback> crudDao) {
        super(crudDao);
    }
}
