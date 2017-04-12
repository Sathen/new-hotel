package com.spring.hotel.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Date;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@javax.persistence.Entity
public class Order extends Entity {


    private UUID userID;
    private ClassApartment classApartment;
    private int amount;
    private Date firstDay;
    private Date lastDay;


}
