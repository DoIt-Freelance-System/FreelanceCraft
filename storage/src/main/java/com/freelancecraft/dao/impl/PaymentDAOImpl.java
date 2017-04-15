package com.freelancecraft.dao.impl;

import com.freelancecraft.dao.PaymentDAO;
import com.freelancecraft.entities.Payment;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDAOImpl extends CrudDAOImpl<Payment> implements PaymentDAO {

    public PaymentDAOImpl(Class<Payment> entityType) {
        super(entityType);
    }
}
