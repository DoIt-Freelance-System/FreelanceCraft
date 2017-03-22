package com.freelancecraft.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Sergiy on 3/23/17.
 */
@Entity
@Table(name = "PAYMENTS")
public class Payment {

    @Column(name = "payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;

    @OneToMany
    @JoinColumn(name = "order_id")
    private int orderId;

    @Column(name = "payment_amount")
    private double paymentAmount;

    @Column(name = "date_of_payment")
    private Date dateOfPayment;

    @Column(name = "payment_status")
    private String paymentStatus;

    public Payment() {
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (paymentId != payment.paymentId) return false;
        if (orderId != payment.orderId) return false;
        if (Double.compare(payment.paymentAmount, paymentAmount) != 0) return false;
        if (!dateOfPayment.equals(payment.dateOfPayment)) return false;
        return paymentStatus.equals(payment.paymentStatus);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = paymentId;
        result = 31 * result + orderId;
        temp = Double.doubleToLongBits(paymentAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + dateOfPayment.hashCode();
        result = 31 * result + paymentStatus.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", orderId=" + orderId +
                ", paymentAmount=" + paymentAmount +
                ", dateOfPayment=" + dateOfPayment +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
