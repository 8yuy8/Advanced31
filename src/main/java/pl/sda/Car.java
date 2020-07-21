package pl.sda;

import java.util.Objects;

public class Car {

    private String model;
    private String manufacturer;
    private String vin;
    private String colour;

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String m) {
        manufacturer = m;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModelAndManufacturer() {
        return model + " " + manufacturer;
    }

    @Override
    public String toString() { //przedefiniowanie metody toString();
        return manufacturer + model;
    }

    public boolean equals(Object anythingElse) {
        if (!this.getClass().equals(anythingElse.getClass())) {
            return false;
        }
        Car car = (Car) anythingElse; //Rzutowanie
        if (this.vin.equals(car.vin)) {
            return true;
        } else {
            return false;
        }
    }
}





