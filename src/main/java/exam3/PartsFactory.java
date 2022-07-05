package exam3;

public class PartsFactory {

    public static Parts getParts(PartsAbstractFactory partsAbstractFactory) {
        return partsAbstractFactory.createParts();
    }
}
