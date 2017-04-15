package com.freelancecraft.service.impl;

import com.freelancecraft.dao.CrudDAO;
import com.freelancecraft.entities.Team;
import com.freelancecraft.service.TeamService;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl extends CrudServiceImpl<Team> implements TeamService {

    public TeamServiceImpl(CrudDAO<Team> crudDao) {
        super(crudDao);
    }
}
