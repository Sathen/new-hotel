package com.spring.hotel.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@javax.persistence.Entity
public class Room extends Entity {

    private Double price;
    private ClassApartment classApartment;
    private int amount;
    private int roomNumber;
    private int status;
}
