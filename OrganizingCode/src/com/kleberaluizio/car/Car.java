package com.kleberaluizio.car;

import java.io.Serializable;
import java.math.BigDecimal;

public class Car implements Serializable {
    private String regNumber;
    private BigDecimal price;

    public Car(){}

    public Car(String regNumber, BigDecimal price) {
        this.regNumber = regNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
