package com.freelancecraft.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Sergiy on 3/23/17.
 */
@Entity
@Table(name = "ATTACHMENTS")
public class Attachment {

    @Column(name = "attachment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attachmentId;

    @OneToMany
    @JoinColumn(name = "message_id")
    private int messageId;

    @OneToMany
    @JoinColumn(name = "order_id")
    private int orderId;

    @Column(name = "name")
    private String name;

    public Attachment() {
    }

    public int getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

        Attachment that = (Attachment) o;

        if (attachmentId != that.attachmentId) return false;
        if (messageId != that.messageId) return false;
        if (orderId != that.orderId) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = attachmentId;
        result = 31 * result + messageId;
        result = 31 * result + orderId;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "attachmentId=" + attachmentId +
                ", messageId=" + messageId +
                ", orderId=" + orderId +
                ", name='" + name + '\'' +
                '}';
    }
}
