package ss22_dp_2.facade;

public class NonVegMenu implements Menu {
    String menu = "meat,fish,age";

    @Override
    public String toString() {
        return "NonVegMenu{" +
                "menu='" + menu + '\'' +
                '}';
    }
}
