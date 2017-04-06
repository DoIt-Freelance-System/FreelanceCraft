package com.freelancecraft.entities;

import javax.persistence.*;

@Entity
@Table(name = "TEAMS")
public class Team extends AbstractEntity {
    @Column(name = "team_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teamId;
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToMany
    @JoinColumn(name = "order_id")
    private Order order;

    public Team() {
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public int hashCode() {
        int result = teamId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (order != null ? order.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (teamId != team.teamId) return false;
        if (name != null ? !name.equals(team.name) : team.name != null) return false;
        if (user != null ? !user.equals(team.user) : team.user != null) return false;
        return order != null ? order.equals(team.order) : team.order == null;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", name='" + name + '\'' +
                ", user=" + user +
                ", order=" + order +
                '}';
    }
}
