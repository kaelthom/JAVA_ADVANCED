package model;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
 /*       Car ferrari = new Car();
        Car porsche = new Car();
        Car dodge = new Car();
        Car coccinelle = new Car();
        Car renault = new Car();*/


/*        Employee employee = new Employee(1);
        employee.sayHello();
        System.out.println("employee salary : "+ employee.getPay());

        CEO ceo = new CEO(100);
        System.out.println("ceo salary : "  + ceo.getPay());

        List<Paid> persons =  new ArrayList<>();
        persons.add(employee);
        persons.add(ceo);*/

        Parking newParking = new Parking("A3", "Standard");
        newParking.add(new RegisteredCar("Peugeot"));
        newParking.add(new UnregisteredCar("Peugeot"));
        newParking.add(new UnregisteredTruck("Peugeot"));
        newParking.add(new RegisteredTruck("Peugeot"));
        newParking.add(new UnregisteredTruck("Peugeot"));

        System.out.println(newParking.getVehicles().size() + " vehicles, unregistered total cost is " + newParking.calculateTotalPrice());
    }
}
