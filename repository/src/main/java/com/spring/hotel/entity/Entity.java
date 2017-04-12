package com.spring.hotel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

public abstract class Entity implements Serializable {

    private static final long serialVersionUID = 5540950323247809759L;
    @Id
    @Getter @Setter
    private UUID id;

}
