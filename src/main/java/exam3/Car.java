package exam3;

public class Car extends Parts{

    private String engineName;
    private int enginePrice;
    private String windowName;
    private int windowPrice;

    public Car(String engineName, int enginePrice, String windowName, int windowPrice) {
        this.engineName = engineName;
        this.enginePrice = enginePrice;
        this.windowName = windowName;
        this.windowPrice = windowPrice;
    }


    @Override
    public String getEngineName() {
        return this.engineName;
    }

    @Override
    public String getWindowName() {
        return this.windowName;
    }

    @Override
    public int getEnginePrice() {
        return this.enginePrice;
    }

    @Override
    public int getWindowPrice() {
        return this.windowPrice;
    }
}
