package exam3;

public abstract class Parts {

    public abstract String getEngineName();
    public abstract String getWindowName();
    public abstract int getEnginePrice();
    public abstract int getWindowPrice();

    @Override
    public String toString() {
        return "engine name = " + getEngineName() + " price : " + getEnginePrice() + " window name: " + getWindowName() + " window price : " + getWindowPrice() ;
    }
}
