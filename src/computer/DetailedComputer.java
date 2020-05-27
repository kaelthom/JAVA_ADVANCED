package computer;

public class DetailedComputer {
    private String serial;
    private int memory;
    private float processor;
    private boolean laptop;
    private boolean online;
    private String graphicCardName;

    public DetailedComputer(String serial, int memory, float processor) {
        this.serial = serial;
        this.memory = memory;
        this.processor = processor;
        this.laptop = false;
        this.graphicCardName = "";
        this.online = false;
    }

    @Override
    public String toString() {
        return "DetailedComputer{" +
                "serial='" + serial + '\'' +
                ", memory=" + memory +
                ", processor=" + processor +
                ", laptop=" + laptop +
                ", online=" + online +
                ", graphicCardName='" + graphicCardName + '\'' +
                '}';
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public float getProcessor() {
        return processor;
    }

    public void setProcessor(float processor) {
        this.processor = processor;
    }

    public boolean isLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getGraphicCardName() {
        return graphicCardName;
    }

    public void setGraphicCardName(String graphicCardName) {
        this.graphicCardName = graphicCardName;
    }
}
