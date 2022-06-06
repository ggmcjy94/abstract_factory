package exam01;

public class DesktopDialog extends MyDialog{
    @Override
    Button createButton() {
        return new DesktopButton();
    }
}
