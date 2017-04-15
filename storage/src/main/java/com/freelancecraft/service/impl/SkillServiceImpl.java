package com.freelancecraft.service.impl;

import com.freelancecraft.dao.CrudDAO;
import com.freelancecraft.entities.Skill;
import com.freelancecraft.service.SkillService;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl extends CrudServiceImpl<Skill> implements SkillService {

    public SkillServiceImpl(CrudDAO<Skill> crudDao) {
        super(crudDao);
    }
}
