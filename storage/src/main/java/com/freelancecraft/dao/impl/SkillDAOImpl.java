package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.SkillDAO;
import com.freelancecraft.entities.Skill;
import org.springframework.stereotype.Repository;

@Repository
public class SkillDAOImpl extends CrudDAOImpl<Skill> implements SkillDAO {

    public SkillDAOImpl(Class<Skill> entityType) {
        super(entityType);
    }
}

