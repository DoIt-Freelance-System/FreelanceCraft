package com.freelancecraft.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDERS")
public class Order {
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinColumn(name = "user_id")
    private User customer;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "date_of_creation")
    private Date dateOfCreation;
    @Column(name = "date_of_completion")
    private Date dateOfComplection;
    @Column(name = "order_type")
    private String orderType;
    @Column(name = "status")
    private String status;

    public Order() {
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

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Date getDateOfComplection() {
        return dateOfComplection;
    }

    public void setDateOfComplection(Date dateOfComplection) {
        this.dateOfComplection = dateOfComplection;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderId != order.orderId) return false;
        if (Double.compare(order.price, price) != 0) return false;
        if (name != null ? !name.equals(order.name) : order.name != null) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        if (description != null ? !description.equals(order.description) : order.description != null) return false;
        if (dateOfCreation != null ? !dateOfCreation.equals(order.dateOfCreation) : order.dateOfCreation != null)
            return false;
        if (dateOfComplection != null ? !dateOfComplection.equals(order.dateOfComplection) : order.dateOfComplection != null)
            return false;
        if (orderType != null ? !orderType.equals(order.orderType) : order.orderType != null) return false;
        return status != null ? status.equals(order.status) : order.status == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dateOfCreation != null ? dateOfCreation.hashCode() : 0);
        result = 31 * result + (dateOfComplection != null ? dateOfComplection.hashCode() : 0);
        result = 31 * result + (orderType != null ? orderType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", name='" + name + '\'' +
                ", customer=" + customer +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", dateOfCreation=" + dateOfCreation +
                ", dateOfComplection=" + dateOfComplection +
                ", orderType='" + orderType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
