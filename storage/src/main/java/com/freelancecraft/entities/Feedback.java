package com.freelancecraft.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FEEDBACK")
public class Feedback extends AbstractEntity {

    @OneToMany
    @JoinColumn(name = "user_id")
    private User feedbackSender;

    @OneToMany
    @JoinColumn(name = "user_id")
    private User feedbackRecipient;

    @OneToMany
    @JoinColumn(name = "order_id")
    private Order oderId;

    @Column(name = "text_of_feedback")
    private String textOfFeedback;

    @Column(name = "date_of_feedback")
    private Date dateOfFeedback;

    public Feedback() {
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

    public Order getOderId() {
        return oderId;
    }

    public void setOderId(Order oderId) {
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
        if (!super.equals(o)) return false;

        Feedback feedback = (Feedback) o;

        if (feedbackSender != null ? !feedbackSender.equals(feedback.feedbackSender) : feedback.feedbackSender != null)
            return false;
        if (feedbackRecipient != null ? !feedbackRecipient.equals(feedback.feedbackRecipient) : feedback.feedbackRecipient != null)
            return false;
        if (oderId != null ? !oderId.equals(feedback.oderId) : feedback.oderId != null) return false;
        if (textOfFeedback != null ? !textOfFeedback.equals(feedback.textOfFeedback) : feedback.textOfFeedback != null)
            return false;
        return dateOfFeedback != null ? dateOfFeedback.equals(feedback.dateOfFeedback) : feedback.dateOfFeedback == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (feedbackSender != null ? feedbackSender.hashCode() : 0);
        result = 31 * result + (feedbackRecipient != null ? feedbackRecipient.hashCode() : 0);
        result = 31 * result + (oderId != null ? oderId.hashCode() : 0);
        result = 31 * result + (textOfFeedback != null ? textOfFeedback.hashCode() : 0);
        result = 31 * result + (dateOfFeedback != null ? dateOfFeedback.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackSender=" + feedbackSender +
                ", id=" + id +
                ", feedbackRecipient=" + feedbackRecipient +
                ", oderId=" + oderId +
                ", textOfFeedback='" + textOfFeedback + '\'' +
                ", dateOfFeedback=" + dateOfFeedback +
                '}';
    }
}
