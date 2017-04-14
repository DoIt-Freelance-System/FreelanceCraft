package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.OrderDAO;
import com.freelancecraft.entities.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl extends CrudDAOImpl<Order> implements OrderDAO {

    public OrderDAOImpl(Class<Order> entityType) {
        super(entityType);
    }
}
