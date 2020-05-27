package computer;

public class Computer {
    private static int count = 0;
    private int id;
    private String name;

    public Computer(String name) {
        this.name = name;
        this.id = count++;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void print(String message) {
        PrinterCentralizer.getInstance().print(this + " print " + message);
    }
}
