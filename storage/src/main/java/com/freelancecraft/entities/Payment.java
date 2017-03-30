package com.freelancecraft.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PAYMENTS")
public class Payment {

    @Column(name = "payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;

    @OneToMany
    @JoinColumn(name = "order_id")
    private Order order;

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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
        if (Double.compare(payment.paymentAmount, paymentAmount) != 0) return false;
        if (order != null ? !order.equals(payment.order) : payment.order != null) return false;
        if (dateOfPayment != null ? !dateOfPayment.equals(payment.dateOfPayment) : payment.dateOfPayment != null)
            return false;
        return paymentStatus != null ? paymentStatus.equals(payment.paymentStatus) : payment.paymentStatus == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = paymentId;
        result = 31 * result + (order != null ? order.hashCode() : 0);
        temp = Double.doubleToLongBits(paymentAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dateOfPayment != null ? dateOfPayment.hashCode() : 0);
        result = 31 * result + (paymentStatus != null ? paymentStatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", order=" + order +
                ", paymentAmount=" + paymentAmount +
                ", dateOfPayment=" + dateOfPayment +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
