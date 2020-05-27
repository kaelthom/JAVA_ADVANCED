package computer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrinterCentralizer {

    private static final List<Printer> DEFAULT_PRINTERS = Arrays.asList(new Printer("Epson"), new Printer("Canon"));
    private static PrinterCentralizer instance;
    private List<Printer> printers;
    private int lastId = 0;

    private PrinterCentralizer(List<Printer> printers) {
        this.printers = printers;
    }

    public static PrinterCentralizer getInstance() {
        if (instance == null) {
            instance = new PrinterCentralizer(new ArrayList<>(DEFAULT_PRINTERS));
        }
        return instance;
    }

    public void print(String message) {
        printers.get(lastId).print(message);
        lastId = (lastId + 1) % printers.size();
    }

    public void addPrinter(Printer printer) {
        printers.add(printer);
    }
}
