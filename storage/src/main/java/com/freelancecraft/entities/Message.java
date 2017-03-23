package com.freelancecraft.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Sergiy on 3/23/17.
 */
@Entity
@Table(name = "MESSAGES")
public class Message {

    @Column(name = "message_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int messageId;

    @OneToMany
    @JoinColumn(name = "user_id")
    private int messageSender;

    @OneToMany
    @JoinColumn(name = "user_id")
    private int messageRecipient;

    @Column(name = "text_of_message")
    private String textOfMessage;

    @Column(name = "date_of_sending")
    private Date dateOfSending;

    @Column(name = "message_type")
    private String messageType;

    @Column(name = "message_status")
    private String messageStatus;

    public Message() {
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(int messageSender) {
        this.messageSender = messageSender;
    }

    public int getMessageRecipient() {
        return messageRecipient;
    }

    public void setMessageRecipient(int messageRecipient) {
        this.messageRecipient = messageRecipient;
    }

    public String getTextOfMessage() {
        return textOfMessage;
    }

    public void setTextOfMessage(String textOfMessage) {
        this.textOfMessage = textOfMessage;
    }

    public Date getDateOfSending() {
        return dateOfSending;
    }

    public void setDateOfSending(Date dateOfSending) {
        this.dateOfSending = dateOfSending;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (messageId != message.messageId) return false;
        if (messageSender != message.messageSender) return false;
        if (messageRecipient != message.messageRecipient) return false;
        if (!textOfMessage.equals(message.textOfMessage)) return false;
        if (!dateOfSending.equals(message.dateOfSending)) return false;
        if (!messageType.equals(message.messageType)) return false;
        return messageStatus.equals(message.messageStatus);
    }

    @Override
    public int hashCode() {
        int result = messageId;
        result = 31 * result + messageSender;
        result = 31 * result + messageRecipient;
        result = 31 * result + textOfMessage.hashCode();
        result = 31 * result + dateOfSending.hashCode();
        result = 31 * result + messageType.hashCode();
        result = 31 * result + messageStatus.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", messageSender=" + messageSender +
                ", messageRecipient=" + messageRecipient +
                ", textOfMessage='" + textOfMessage + '\'' +
                ", dateOfSending=" + dateOfSending +
                ", messageType='" + messageType + '\'' +
                ", messageStatus='" + messageStatus + '\'' +
                '}';
    }
}
