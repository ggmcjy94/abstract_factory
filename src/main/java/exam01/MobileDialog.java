package exam01;

public class MobileDialog extends MyDialog{
    @Override
    Button createButton() {
        return new MobileButton();
    }
}
