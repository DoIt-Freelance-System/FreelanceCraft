package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.TeamDAO;
import com.freelancecraft.entities.Team;
import org.springframework.stereotype.Repository;

@Repository
public class TeamDAOImpl extends CrudDAOImpl<Team> implements TeamDAO {

    public TeamDAOImpl(Class<Team> entityType) {
        super(entityType);
    }
}
