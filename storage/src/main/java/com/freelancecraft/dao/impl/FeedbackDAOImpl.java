package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.FeedbackDAO;
import com.freelancecraft.entities.Feedback;

/**
 * Created by Vlad on 01.04.2017.
 */
public class FeedbackDAOImpl extends CrudDAOImpl<Feedback> implements FeedbackDAO {
    @Override
    public String getFindQuery(Integer id) {
        return "SELECT * FROM FEEDBACKS a WHERE a.id="+ id;
    }
}
