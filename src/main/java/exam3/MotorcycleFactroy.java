package exam3;

public class MotorcycleFactroy implements PartsAbstractFactory{

    private String engineName;
    private int enginePrice;
    private String windowName;
    private int windowPrice;

    public MotorcycleFactroy(String engineName, int enginePrice, String windowName, int windowPrice) {
        this.engineName = engineName;
        this.enginePrice = enginePrice;
        this.windowName = windowName;
        this.windowPrice = windowPrice;
    }

    @Override
    public Parts createParts() {
        return new Motorcycle(engineName,enginePrice,windowName,windowPrice);
    }
}
