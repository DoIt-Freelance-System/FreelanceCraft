package com.freelancecraft.enums;


public enum OrderStatus {
    //CREATED - на будущее, по типу черновика
    OPEN,
    IN_PROGRESS,
    COMPLETED,
    CLOSED,         //заказ оплачен и закрыт
    REJECTED;        //заказ закрыт из-за неактуальности или отменен
}
