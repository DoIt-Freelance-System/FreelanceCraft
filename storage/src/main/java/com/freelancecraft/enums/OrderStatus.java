package com.freelancecraft.enums;

/**
 * Created by Sergiy on 3/24/17.
 */
public enum OrderStatus {
    //CREATED - на будущее, по типу черновика
    OPEN,
    IN_PROGRESS,
    COMPLETED,
    CLOSED,         //заказ оплачен и закрыт
    REJECTED        //заказ закрыт из-за неактуальности или отменен
}
