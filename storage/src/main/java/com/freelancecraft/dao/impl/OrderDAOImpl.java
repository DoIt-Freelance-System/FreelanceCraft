package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.OrderDAO;
import com.freelancecraft.entities.Order;

/**
 * Created by Vlad on 01.04.2017.
 */
public class OrderDAOImpl extends CrudDAOImpl<Order> implements OrderDAO {
    @Override
    public String getFindQuery(Integer id) {
        return "SELECT * FROM ORDERS a WHERE a.id="+ id;
    }


}
