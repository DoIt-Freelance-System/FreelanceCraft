package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.SkillDAO;
import com.freelancecraft.entities.Skill;

/**
 * Created by Vlad on 01.04.2017.
 */
public class SkillDAOImpl extends CrudDAOImpl<Skill> implements SkillDAO {
    @Override
    public String getFindQuery(Integer id) {
        return "SELECT * FROM SKILLS a WHERE a.id="+ id;
    }
}

