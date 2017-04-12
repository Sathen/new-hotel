package com.spring.hotel.entity;


public enum ClassApartment {

    DELUXE, SUITE, STANDARD, CHEAP;


    public static ClassApartment getClassApartment(int id) {
        return ClassApartment.values()[id];
    }


    public String getName() {
        return name().toLowerCase();
    }

}
