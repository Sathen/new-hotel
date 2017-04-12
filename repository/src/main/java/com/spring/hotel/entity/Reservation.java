package com.spring.hotel.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Date;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@javax.persistence.Entity
public class Reservation extends Entity {

    private UUID roomID;
    private UUID userID;
    private Date firstDay;
    private Date lastDay;
    private String status;

}
