package com.freelancecraft.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FEEDBACK")
public class Feedback {

    @Column(name = "feedback_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedbackId;

    @OneToMany
    @JoinColumn(name = "user_id")
    private User feedbackSender;

    @OneToMany
    @JoinColumn(name = "user_id")
    private User feedbackRecipient;

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

    public User getFeedbackSender() {
        return feedbackSender;
    }

    public void setFeedbackSender(User feedbackSender) {
        this.feedbackSender = feedbackSender;
    }

    public User getFeedbackRecipient() {
        return feedbackRecipient;
    }

    public void setFeedbackRecipient(User feedbackRecipient) {
        this.feedbackRecipient = feedbackRecipient;
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
        if (oderId != feedback.oderId) return false;
        if (feedbackSender != null ? !feedbackSender.equals(feedback.feedbackSender) : feedback.feedbackSender != null)
            return false;
        if (feedbackRecipient != null ? !feedbackRecipient.equals(feedback.feedbackRecipient) : feedback.feedbackRecipient != null)
            return false;
        if (textOfFeedback != null ? !textOfFeedback.equals(feedback.textOfFeedback) : feedback.textOfFeedback != null)
            return false;
        return dateOfFeedback != null ? dateOfFeedback.equals(feedback.dateOfFeedback) : feedback.dateOfFeedback == null;
    }

    @Override
    public int hashCode() {
        int result = feedbackId;
        result = 31 * result + (feedbackSender != null ? feedbackSender.hashCode() : 0);
        result = 31 * result + (feedbackRecipient != null ? feedbackRecipient.hashCode() : 0);
        result = 31 * result + oderId;
        result = 31 * result + (textOfFeedback != null ? textOfFeedback.hashCode() : 0);
        result = 31 * result + (dateOfFeedback != null ? dateOfFeedback.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", feedbackSender=" + feedbackSender +
                ", feedbackRecipient=" + feedbackRecipient +
                ", oderId=" + oderId +
                ", textOfFeedback='" + textOfFeedback + '\'' +
                ", dateOfFeedback=" + dateOfFeedback +
                '}';
    }
}
