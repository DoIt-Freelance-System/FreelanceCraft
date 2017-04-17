package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.TeamDAO;
import com.freelancecraft.entities.Team;

public class TeamDAOImpl extends CrudDAOImpl<Team> implements TeamDAO {

    public TeamDAOImpl(Class<Team> entityType) {
        super(entityType);
    }
}
