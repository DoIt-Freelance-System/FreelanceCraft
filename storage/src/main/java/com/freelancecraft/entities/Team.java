package com.freelancecraft.entities;

import javax.persistence.*;

@Entity
@Table(name = "TEAMS")
public class Team extends AbstractEntity {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Team team = (Team) o;

        if (name != null ? !name.equals(team.name) : team.name != null) return false;
        if (user != null ? !user.equals(team.user) : team.user != null) return false;
        return order != null ? order.equals(team.order) : team.order == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (order != null ? order.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", user=" + user +
                ", id=" + id +
                ", order=" + order +
                '}';
    }
}
