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
        System.out.println("Computer 1 printing...");
        cp1.print(HELLO);
        System.out.println("Computer 2 printing...");
        cp2.print(HELLO);
        System.out.println("Computer 3 printing...");
        cp3.print(HELLO);
        System.out.println("Computer 4 printing...");
        cp4.print(HELLO);
        System.out.println("Computer 5 printing...");
        cp5.print(HELLO);
        System.out.println("Computer 6 printing...");
        cp6.print(HELLO);
    }
}
