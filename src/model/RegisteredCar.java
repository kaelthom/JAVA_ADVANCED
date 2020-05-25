package model;

public final class RegisteredCar extends Car{
    public RegisteredCar(String brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return "RegisteredCar " + brand +" with id : " + id;
    }


}
