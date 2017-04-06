package com.freelancecraft.entities;

import javax.persistence.*;

@Entity
@Table(name = "ATTACHMENTS")
public class Attachment extends AbstractEntity {


    @OneToMany
    @JoinColumn(name = "message_id")
    private Message message;

    @OneToMany
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "link")
    private String link;

    public Attachment() {
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attachment that = (Attachment) o;

        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (order != null ? !order.equals(that.order) : that.order != null) return false;
        return link != null ? link.equals(that.link) : that.link == null;
    }

    @Override
    public int hashCode() {
        int result = message != null ? message.hashCode() : 0;
        result = 31 * result + (order != null ? order.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "message=" + message +
                ", order=" + order +
                ", id=" + id +
                ", link='" + link + '\'' +
                '}';
    }
}
