package com.freelancecraft.entities;

import com.freelancecraft.enums.PaymentStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PAYMENTS")
public class Payment extends AbstractEntity {

    @OneToMany
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "payment_amount")
    private double paymentAmount;

    @Column(name = "date_of_payment")
    private Date dateOfPayment;

    @Column(name = "payment_status")
    private PaymentStatus paymentStatus;

    public Payment() {
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

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Payment payment = (Payment) o;

        if (Double.compare(payment.paymentAmount, paymentAmount) != 0) return false;
        if (order != null ? !order.equals(payment.order) : payment.order != null) return false;
        if (dateOfPayment != null ? !dateOfPayment.equals(payment.dateOfPayment) : payment.dateOfPayment != null)
            return false;
        return paymentStatus == payment.paymentStatus;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
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
                "order=" + order +
                ", id=" + id +
                ", paymentAmount=" + paymentAmount +
                ", dateOfPayment=" + dateOfPayment +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
