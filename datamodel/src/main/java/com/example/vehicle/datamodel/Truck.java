package com.example.vehicle.datamodel;
@lombok.Getter
@lombok.Setter
public class Truck extends Vehicle implements CargoWeight { 
    private Integer currentCargoWeight;
    private Integer maxCargoWeight;
}
