package computer;

public class Application {

    public static final String HELLO = "Hello";

    public static void main(String[] args) {
        PrinterCentralizer printerCentralizer = PrinterCentralizer.getInstance();
        printerCentralizer.addPrinter(new Printer("Other printer"));

        Computer cp1 = new Computer("cp1");
        Computer cp2 = new Computer("cp2");
        Computer cp3 = new Computer("cp3");
        Computer cp4 = new Computer("cp4");
        Computer cp5 = new Computer("cp5");
        Computer cp6 = new Computer("cp6");
        cp1.print(HELLO);
        cp2.print(HELLO);
        cp3.print(HELLO);
        cp4.print(HELLO);
        cp5.print(HELLO);
        cp6.print(HELLO);
    }
}
