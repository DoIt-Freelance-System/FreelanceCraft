package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.PaymentDAO;
import com.freelancecraft.entities.Payment;

public class PaymentDAOImpl extends CrudDAOImpl<Payment> implements PaymentDAO {

    public PaymentDAOImpl(Class<Payment> entityType) {
        super(entityType);
    }
}
