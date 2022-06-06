package exam01;

public class Client {

    public static void main(String[] args) {
        MyDialog dialog = new MobileDialog();
        Button button = dialog.createButton();
        button.onClick();

    }
}
