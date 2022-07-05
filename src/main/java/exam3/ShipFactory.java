package exam3;

public class ShipFactory implements PartsAbstractFactory{

    private String engineName;
    private int enginePrice;
    private String windowName;
    private int windowPrice;

    public ShipFactory(String engineName, int enginePrice, String windowName, int windowPrice) {
        this.engineName = engineName;
        this.enginePrice = enginePrice;
        this.windowName = windowName;
        this.windowPrice = windowPrice;
    }

    @Override
    public Parts createParts() {
        return new Ship(engineName,enginePrice,windowName,windowPrice);
    }
}
