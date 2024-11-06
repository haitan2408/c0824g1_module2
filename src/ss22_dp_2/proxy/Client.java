package ss22_dp_2.proxy;

public class Client {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("w3school.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
