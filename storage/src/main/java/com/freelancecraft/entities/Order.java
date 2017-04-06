package com.freelancecraft.entities;

import com.freelancecraft.enums.OrderStatus;
import com.freelancecraft.enums.OrderType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDERS")
public class Order extends AbstractEntity {

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
    private OrderType orderType;
    @Column(name = "status")
    private OrderStatus orderStatus;

    public Order() {
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

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Order order = (Order) o;

        if (Double.compare(order.price, price) != 0) return false;
        if (name != null ? !name.equals(order.name) : order.name != null) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        if (description != null ? !description.equals(order.description) : order.description != null) return false;
        if (dateOfCreation != null ? !dateOfCreation.equals(order.dateOfCreation) : order.dateOfCreation != null)
            return false;
        if (dateOfComplection != null ? !dateOfComplection.equals(order.dateOfComplection) : order.dateOfComplection != null)
            return false;
        if (orderType != order.orderType) return false;
        return orderStatus == order.orderStatus;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dateOfCreation != null ? dateOfCreation.hashCode() : 0);
        result = 31 * result + (dateOfComplection != null ? dateOfComplection.hashCode() : 0);
        result = 31 * result + (orderType != null ? orderType.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", customer=" + customer +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", dateOfCreation=" + dateOfCreation +
                ", dateOfComplection=" + dateOfComplection +
                ", orderType=" + orderType +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
