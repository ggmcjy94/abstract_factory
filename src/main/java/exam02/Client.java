package exam02;

public class Client {

    public static void main(String[] args) {
        Product com = ProductFactory.getProduct(new ComputerFactory("com1", 2000));
        Product tk = ProductFactory.getProduct(new TicketFactory("공연", 10000));
        System.out.println(com.toString());
        System.out.println(tk.toString());
    }
}
