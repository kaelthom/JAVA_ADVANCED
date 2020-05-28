package model;

public class CitySign extends AbstractObserver {
    private static int count;
    private int id;
    private String info;
    private String name;

    public CitySign(String name) {
        this.id = count++;
        this.info = "";
        this.name = name;
    }

    @Override
    public String toString() {
        return "CitySign{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    void update(String message) {
        System.out.println(this + "has been notified of " + message);
        this.info = message;
    }
}
