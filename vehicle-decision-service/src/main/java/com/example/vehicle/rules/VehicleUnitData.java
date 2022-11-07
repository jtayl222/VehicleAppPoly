package com.example.vehicle.rules;

import com.example.vehicle.datamodel.Vehicle;
import com.example.vehicle.datamodel.Car;
import com.example.vehicle.datamodel.Truck;
import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

@lombok.Getter
@lombok.Setter
public class VehicleUnitData implements RuleUnitData {

    public DataStore<Vehicle> vehicleInstances = 
        DataSource.createStore();

}
