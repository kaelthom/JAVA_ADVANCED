package model;

public class CEO extends Person {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public CEO(int id) {
        super(id);
    }

    @Override
    public int getPay() {
        return 10000;
    }
}
