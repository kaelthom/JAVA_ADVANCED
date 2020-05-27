package computer;

public class DetailedComputerBuilder {
    private DetailedComputer detailedComputer;

    public DetailedComputerBuilder(String serial, int memory, float processor) {
        this.detailedComputer = new DetailedComputer(serial, memory, processor);
    }

    public DetailedComputerBuilder withGraphicCard(String graphicCard) {
        this.detailedComputer.setGraphicCardName(graphicCard);
        return this;
    }

    public DetailedComputerBuilder isLaptop() {
        this.detailedComputer.setLaptop(true);
        return this;
    }

    public DetailedComputerBuilder setOnline() {
        this.detailedComputer.setOnline(true);
        return this;
    }

    public DetailedComputer build() {
        return this.detailedComputer;
    }
}
