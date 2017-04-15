package com.freelancecraft.service.impl;

import com.freelancecraft.dao.CrudDAO;
import com.freelancecraft.entities.Payment;
import com.freelancecraft.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends CrudServiceImpl<Payment> implements PaymentService {

    public PaymentServiceImpl(CrudDAO<Payment> crudDao) {
        super(crudDao);
    }
}
