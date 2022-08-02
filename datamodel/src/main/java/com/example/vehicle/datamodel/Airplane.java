package com.example.vehicle.datamodel;
@lombok.Getter
@lombok.Setter
public class Airplane extends Vehicle implements Altitude {
    private Integer currentAltitude;
    private Integer maxAltitude;
}
