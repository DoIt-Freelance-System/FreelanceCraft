package com.freelancecraft.service.impl;

import com.freelancecraft.dao.CrudDAO;
import com.freelancecraft.entities.Order;
import com.freelancecraft.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends CrudServiceImpl<Order> implements OrderService {

    public OrderServiceImpl(CrudDAO<Order> crudDao) {
        super(crudDao);
    }
}
