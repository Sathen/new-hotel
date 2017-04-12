package com.spring.hotel.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Date;
import java.util.UUID;


@Data
@EqualsAndHashCode(callSuper = true)
@javax.persistence.Entity
public class Bill extends Entity {

    private static final long serialVersionUID = -9077157635063582448L;

    private UUID reservID;
    private double totalPrice;
    private Date date;
    private String status;

}
