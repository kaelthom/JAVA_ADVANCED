package model;

public class Employee extends Person{
    public Employee(int id) {
        super(id);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
