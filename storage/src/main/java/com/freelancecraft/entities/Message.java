package com.freelancecraft.entities;

import com.freelancecraft.enums.MessageStatus;
import com.freelancecraft.enums.MessageType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MESSAGES")
public class Message {

    @Column(name = "message_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int messageId;

    @OneToMany
    @JoinColumn(name = "user_id")
    private User messageSender;

    @OneToMany
    @JoinColumn(name = "user_id")
    private User messageRecipient;

    @Column(name = "text_of_message")
    private String textOfMessage;

    @Column(name = "date_of_sending")
    private Date dateOfSending;

    @Column(name = "message_type")
    private MessageType messageType;

    @Column(name = "message_status")
    private MessageStatus messageStatus;

    public Message() {
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public User getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(User messageSender) {
        this.messageSender = messageSender;
    }

    public User getMessageRecipient() {
        return messageRecipient;
    }

    public void setMessageRecipient(User messageRecipient) {
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

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public MessageStatus getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(MessageStatus messageStatus) {
        this.messageStatus = messageStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (messageId != message.messageId) return false;
        if (messageSender != null ? !messageSender.equals(message.messageSender) : message.messageSender != null)
            return false;
        if (messageRecipient != null ? !messageRecipient.equals(message.messageRecipient) : message.messageRecipient != null)
            return false;
        if (textOfMessage != null ? !textOfMessage.equals(message.textOfMessage) : message.textOfMessage != null)
            return false;
        if (dateOfSending != null ? !dateOfSending.equals(message.dateOfSending) : message.dateOfSending != null)
            return false;
        if (messageType != message.messageType) return false;
        return messageStatus == message.messageStatus;
    }

    @Override
    public int hashCode() {
        int result = messageId;
        result = 31 * result + (messageSender != null ? messageSender.hashCode() : 0);
        result = 31 * result + (messageRecipient != null ? messageRecipient.hashCode() : 0);
        result = 31 * result + (textOfMessage != null ? textOfMessage.hashCode() : 0);
        result = 31 * result + (dateOfSending != null ? dateOfSending.hashCode() : 0);
        result = 31 * result + (messageType != null ? messageType.hashCode() : 0);
        result = 31 * result + (messageStatus != null ? messageStatus.hashCode() : 0);
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
                ", messageType=" + messageType +
                ", messageStatus=" + messageStatus +
                '}';
    }
}
