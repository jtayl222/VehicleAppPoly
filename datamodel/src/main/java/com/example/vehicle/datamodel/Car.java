package com.example.vehicle.datamodel;
@lombok.Getter
@lombok.Setter
public class Car extends Vehicle implements Passengers {
    private Integer currentPassengers;
    private Integer maxPassengers;
}
