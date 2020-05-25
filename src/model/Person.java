package model;

public abstract class Person implements Paid{
    static int id;
    String lastName;
    String firstName;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public int getPay() {
        return 2000;
    }

    public abstract void sayHello ();
}
