package com.freelancecraft.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Sergiy on 3/23/17.
 */
@Entity
@Table(name = "FEEDBACK")
public class Feedback {

    @Column(name = "feedback_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedbackId;

    @OneToMany
    @JoinColumn(name = "user_id")
    private int feedbackSender;

    @OneToMany
    @JoinColumn(name = "user_id")
    private int feedbackRecipient;

    @OneToMany
    @JoinColumn(name = "order_id")
    private int oderId;

    @Column(name = "text_of_feedback")
    private String textOfFeedback;

    @Column(name = "date_of_feedback")
    private Date dateOfFeedback;

    public Feedback() {
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getSender() {
        return feedbackSender;
    }

    public void setSender(int sender) {
        this.feedbackSender = sender;
    }

    public int getRecipient() {
        return feedbackRecipient;
    }

    public void setRecipient(int recipient) {
        this.feedbackRecipient = recipient;
    }

    public int getOderId() {
        return oderId;
    }

    public void setOderId(int oderId) {
        this.oderId = oderId;
    }

    public String getTextOfFeedback() {
        return textOfFeedback;
    }

    public void setTextOfFeedback(String textOfFeedback) {
        this.textOfFeedback = textOfFeedback;
    }

    public Date getDateOfFeedback() {
        return dateOfFeedback;
    }

    public void setDateOfFeedback(Date dateOfFeedback) {
        this.dateOfFeedback = dateOfFeedback;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feedback feedback = (Feedback) o;

        if (feedbackId != feedback.feedbackId) return false;
        if (feedbackSender != feedback.feedbackSender) return false;
        if (feedbackRecipient != feedback.feedbackRecipient) return false;
        if (oderId != feedback.oderId) return false;
        if (!textOfFeedback.equals(feedback.textOfFeedback)) return false;
        return dateOfFeedback.equals(feedback.dateOfFeedback);
    }

    @Override
    public int hashCode() {
        int result = feedbackId;
        result = 31 * result + feedbackSender;
        result = 31 * result + feedbackRecipient;
        result = 31 * result + oderId;
        result = 31 * result + textOfFeedback.hashCode();
        result = 31 * result + dateOfFeedback.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", sender=" + feedbackSender +
                ", recipient=" + feedbackRecipient +
                ", oderId=" + oderId +
                ", textOfFeedback='" + textOfFeedback + '\'' +
                ", dateOfFeedback=" + dateOfFeedback +
                '}';
    }
}
