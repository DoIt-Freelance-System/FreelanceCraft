package com.freelancecraft.entities;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "SKILLS")
public class Skill extends AbstractEntity {

    @Id
    @Column(name = "skill_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int skillId;

    @Column(name = "name")
    private String name;

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skill skill = (Skill) o;

        if (skillId != skill.skillId) return false;
        return name.equals(skill.name);
    }

    @Override
    public int hashCode() {
        int result = skillId;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillId=" + skillId +
                ", name='" + name + '\'' +
                '}';
    }
}
