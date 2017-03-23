package com.freelancecraft.entities;

import javax.persistence.*;

/**
 * Created by Vlad on 23.03.2017.
 */
@Entity
@Table(name = "TEAMS")
public class Team {
    @Column(name = "team_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teamId;
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinColumn(name = "user_id")
    private int userId;
    @ManyToMany
    @JoinColumn(name = "order_id")
    private int orderId;

    public Team() {
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (teamId != team.teamId) return false;
        if (userId != team.userId) return false;
        if (orderId != team.orderId) return false;
        return name != null ? name.equals(team.name) : team.name == null;
    }

    @Override
    public int hashCode() {
        int result = teamId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + userId;
        result = 31 * result + orderId;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", orderId=" + orderId +
                '}';
    }
}
