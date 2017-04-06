package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.TeamDAO;
import com.freelancecraft.entities.Team;

/**
 * Created by Vlad on 01.04.2017.
 */
public class TeamDAOImpl extends CrudDAOImpl<Team> implements TeamDAO {
    @Override
    public String getFindQuery(Integer id) {
        return "SELECT * FROM TEAMS a WHERE a.id="+ id;
    }
}
