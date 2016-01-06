package models;

import enums.CarBrand;

/**
 * Created by harshita.k on 06/01/16.
 */
public class Car {
    private CarBrand carBrand;

    public Car(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public Car() {
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }
}
