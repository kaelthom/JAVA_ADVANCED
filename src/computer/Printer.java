package computer;

public class Printer {
    private static int count = 0;
    private int id;
    private String brand;

    public Printer(String brand) {
        this.brand = brand;
        this.id = count++;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void print(String message) {
        System.out.println(message + " printed on " + this);
    }


}
