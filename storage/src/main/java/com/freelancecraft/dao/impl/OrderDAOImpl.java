package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.OrderDAO;
import com.freelancecraft.entities.Order;

public class OrderDAOImpl extends CrudDAOImpl<Order> implements OrderDAO {

    public OrderDAOImpl(Class<Order> entityType) {
        super(entityType);
    }
}
